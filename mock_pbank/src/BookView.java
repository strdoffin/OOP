
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author yossawatimjai
 */
public class BookView implements WindowListener{

    ArrayList data = new ArrayList();
    
    private JFrame frame = new JFrame("");
    private JPanel container = new JPanel(new BorderLayout());
    private JPanel sub_con = new JPanel(new GridLayout(3, 2));
    private JPanel sub_con2 = new JPanel(new GridLayout(2, 1));
    private JPanel order_con = new JPanel(new FlowLayout());
    private JPanel util_con = new JPanel(new FlowLayout());

    private JLabel t_name = new JLabel("Name");
    private JLabel t_price = new JLabel("Price");
    private JLabel t_type = new JLabel("Type");

    private String[] type_list = {"General", "Computer", "Math&Sci", "Photo"};

    JTextField tf_name = new JTextField();
    JTextField tf_price = new JTextField();
    JComboBox cb_type = new JComboBox(type_list);
    JTextField book_order = new JTextField(5);
    private JButton go_left = new JButton("<<<");
    private JButton go_right = new JButton(">>>");
    private JButton b_add = new JButton("Add");
    private JButton b_update = new JButton("Update");
    private JButton b_delete = new JButton("Delete");

    public BookView() {


        b_add.addActionListener((ActionEvent e) -> {
            BookAdd bookAdd = new BookAdd(BookView.this);
        });
        b_update.addActionListener((ActionEvent e) -> {
            Book selected = (Book) data.get(Integer.parseInt(book_order.getText()) - 1);
            selected.setName(tf_name.getText());
            selected.setPrice(Double.parseDouble(tf_price.getText()));
            selected.setType((String) cb_type.getSelectedItem());
            JOptionPane.showMessageDialog(frame, "Done it.");
        });
        b_delete.addActionListener((ActionEvent e) -> {
            Book selected = (Book) data.remove(Integer.parseInt(book_order.getText()) - 1);
            if (!data.isEmpty()){
                Book b = (Book) data.get(0);
                tf_name.setText(b.getName());
                tf_price.setText(b.getPrice()+"");
                cb_type.setSelectedItem(b.getType());
                book_order.setText("1");
            }else{
                
                tf_name.setText("");
                tf_price.setText("");
                cb_type.setSelectedItem(0);
                book_order.setText("0");
            }
            JOptionPane.showMessageDialog(frame, "Done it.");
        });

        //start gen
        go_left.addActionListener(e -> {
            int current = Integer.parseInt(book_order.getText());
            if (current > 1) {
                int targetIndex = current - 2;
                Book b = (Book) data.get(targetIndex);
                tf_name.setText(b.getName());
                tf_price.setText(b.getPrice()+"");
                cb_type.setSelectedItem(b.getType());
                book_order.setText(current-1 + "");
            }
        });

        go_right.addActionListener(e -> {
            int current = Integer.parseInt(book_order.getText());
            if (current < data.size()) {
                int targetIndex = current;
                Book b = (Book) data.get(targetIndex);
                tf_name.setText(b.getName());
                tf_price.setText(b.getPrice()+"");
                cb_type.setSelectedItem(b.getType());
                book_order.setText(current+1 + "");
            }
        });

        sub_con.add(t_name);
        sub_con.add(tf_name);
        sub_con.add(t_price);
        sub_con.add(tf_price);
        sub_con.add(t_type);
        sub_con.add(cb_type);
        container.add(sub_con, BorderLayout.CENTER);

        order_con.add(go_left);
//        book_order.setText(0 + "");
        order_con.add(book_order);
        order_con.add(go_right);

        util_con.add(b_add);
        util_con.add(b_update);
        util_con.add(b_delete);
        sub_con2.add(order_con);
        sub_con2.add(util_con);

        container.add(sub_con2, BorderLayout.SOUTH);
        frame.add(container);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.addWindowListener(this);
    }

    public static void main(String[] args) {
        new BookView();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File file_check = new File("Book.data");
        if (!file_check.exists()){
            tf_name.setText("");
            tf_price.setText("");
            cb_type.setSelectedIndex(0);
            book_order.setText("");
            return;
        }
        try (ObjectInputStream inp = new ObjectInputStream(new FileInputStream("Book.data"))){
            data = (ArrayList) inp.readObject();
            Book in = (Book) data.get(0);
            tf_name.setText(in.getName());
            tf_price.setText(in.getPrice() + "");
            cb_type.setSelectedItem(in.getType());
            book_order.setText("1");
        } catch (FileNotFoundException ex) {
            System.getLogger(BookView.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.getLogger(BookView.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Book.data"))){
            if (!data.isEmpty()){            
                out.writeObject(data);
            }
        } catch (FileNotFoundException ex) {
            System.getLogger(BookView.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (IOException ex) {
            System.getLogger(BookView.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
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
