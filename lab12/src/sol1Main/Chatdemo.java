/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
package sol1Main;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Chatdemo implements ActionListener, WindowListener {

    private JFrame fr;
    private JPanel container, subcontainer;
    private JTextArea ui;
    private JTextField input;
    private JButton submit, reset;

    public Chatdemo() {
        fr = new JFrame("Chatdemo");
        container = new JPanel();
        subcontainer = new JPanel(new FlowLayout());
        submit = new JButton("submit");
        reset = new JButton("reset");

        submit.addActionListener(this);
        reset.addActionListener(this);
        ui = new JTextArea(45, 20);
        input = new JTextField(45);
        container.setLayout(new BorderLayout());
        ui.setEditable(false);
        subcontainer.add(submit);
        subcontainer.add(reset);
        container.add(input, BorderLayout.NORTH);
        container.add(subcontainer, BorderLayout.SOUTH);
        fr.add(ui, BorderLayout.CENTER);
        fr.addWindowListener(this);
        fr.add(container, BorderLayout.SOUTH);
        fr.setSize(500, 500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = e.getActionCommand();
        if (value.equals("submit")) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            if (ui.getText().equals("")) {
                ui.setText(ui.getText() + dtf.format(LocalDateTime.now()) + ": " + input.getText());
            } else {
                ui.setText(ui.getText() + "\n" + dtf.format(LocalDateTime.now()) + ": " + input.getText());
            }
            input.setText("");
        } else if (value.equals("reset")) {
            ui.setText("");
        }
    }

    public void saveData(String data) {
        try (FileOutputStream fout = new FileOutputStream("ChatDemo.dat"); DataOutputStream dout = new DataOutputStream(fout)) {

            dout.writeUTF(data);

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void readData() {
        try (FileInputStream fin = new FileInputStream("ChatDemo.dat"); DataInputStream din = new DataInputStream(fin)) {

            String data = din.readUTF();
            ui.setText(data);

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        readData();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        saveData(ui.getText());
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
