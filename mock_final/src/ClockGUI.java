
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ClockGUI implements ActionListener, WindowListener{
    private int total_log = 0;
    //frame
    private JFrame frame = new JFrame("Clock");
    private JFrame log_window = new JFrame("Logs Window");
    //panel
    private JPanel container = new JPanel(new BorderLayout());
    private JPanel save_container = new JPanel(new FlowLayout());
    private ClockPanel clock_p = new ClockPanel();
    private JPanel output_container = new JPanel(new BorderLayout());
    private JPanel log_status = new JPanel(new BorderLayout());
    //thread
    private Thread t;
    //components
    private JTextArea log = new JTextArea(10,50);
    private JTextField input = new JTextField(50);
    private JButton clear_log = new JButton("Clear Logs");
    private JButton save = new JButton("Save");
    private JLabel total_text = new JLabel("Total Logs: "+total_log);
    public ClockGUI(){
        save.addActionListener(this);
        t = new Thread(clock_p);
        t.start();
        clock_p.setBorder(new EmptyBorder(10,10,10,10));
        save_container.add(input);
        save_container.add(save);
        container.add(clock_p,BorderLayout.CENTER);
        container.add(save_container,BorderLayout.SOUTH);
        frame.add(container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        
        log.setEditable(false);
        clear_log.addActionListener(this);
        log_status.add(total_text,BorderLayout.WEST);
        log_status.add(clear_log,BorderLayout.EAST);
        output_container.add(log,BorderLayout.CENTER);
        output_container.add(log_status,BorderLayout.SOUTH);
        log_window.add(output_container);
        log_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log_window.setResizable(false);
        log_window.pack();
        log_window.setVisible(true);
        
        log_window.addWindowListener(this);
        frame.addWindowListener(this);
    }
    
    public static void main(String[] args) {
        new ClockGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == save){
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String date = now.format(dateFormatter);
            String time = now.format(timeFormatter);
            if (log.getText().isEmpty()){
                log.setText(date+" "+time+":"+input.getText());
            }else{
                log.setText(log.getText()+"\n"+date+" "+time+":"+input.getText());
            }
            input.setText("");
            total_log+=1;
            total_text.setText("Total Logs: "+total_log+"");
        }else if (e.getSource() == clear_log){
            total_log = 0;
            total_text.setText("Total Logs: "+total_log+"");
            log.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("logs.txt");
        if (!f.exists())return; 
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("logs.txt"))){
            Dataobj data= (Dataobj)in.readObject();
            total_log = data.getTotal();
            log.setText(data.getText());
            total_text.setText("Total Logs: "+total_log);
        }
        catch (ClassNotFoundException | FileNotFoundException ex) {
            System.getLogger(ClockGUI.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (IOException ex) {
            System.getLogger(ClockGUI.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        Dataobj obj = new Dataobj(log.getText(),total_log);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("logs.txt"))){
            out.writeObject(obj);
        }catch(IOException ex){
            ex.printStackTrace();
        }   
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
