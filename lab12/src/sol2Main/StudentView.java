
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author yossawatimjai
 */
public class StudentView implements ActionListener, WindowListener {

    private JFrame fr;
    private JPanel container;
    private JTextField tf_id, tf_name, tf_money;
    private JLabel l_id, l_name, l_money;
    private JButton deposit, withdraw;
    private Student s1;

    public StudentView() {
        s1 = new Student();
        fr = new JFrame("StudentProfile");
        container = new JPanel(new GridLayout(4, 2));
        l_id = new JLabel("ID:");
        l_name = new JLabel("Name:");
        l_money = new JLabel("Money:");
        tf_id = new JTextField();
        tf_name = new JTextField();
        tf_money = new JTextField();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        tf_money.setEditable(false);
        container.add(l_id);
        container.add(tf_id);
        container.add(l_name);
        container.add(tf_name);
        container.add(l_money);
        container.add(tf_money);
        container.add(deposit);
        container.add(withdraw);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        fr.add(container);
        fr.addWindowListener(this);
        fr.setVisible(true);
        fr.setSize(300, 150);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void saveData(Student data) {
        try (FileOutputStream fout = new FileOutputStream("StudentM.dat"); ObjectOutputStream dout = new ObjectOutputStream(fout)) {

            dout.writeObject(data);

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void readData() {
        try (FileInputStream fin = new FileInputStream("StudentM.dat"); ObjectInputStream din = new ObjectInputStream(fin)) {

            s1 = (Student) din.readObject();

        } catch (IOException | ClassNotFoundException e) {
            s1 = new Student();
        }
        tf_name.setText(s1.getName());
        tf_id.setText(s1.getID() + "");
        tf_money.setText(s1.getMoney() + "");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Deposit")) {
            s1.setMoney(s1.getMoney() + 100);
            tf_money.setText(s1.getMoney() + "");
        } else if (e.getActionCommand().equals("Withdraw")) {
            s1.setMoney(s1.getMoney() - 100);
            tf_money.setText(s1.getMoney() + "");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        readData();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        s1.setName(tf_name.getText());

        try {
            s1.setID(Integer.parseInt(tf_id.getText()));
        } catch (NumberFormatException ex) {
            s1.setID(0);
        }
        saveData(s1);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
