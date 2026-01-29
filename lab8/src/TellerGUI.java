/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
import javax.swing.*;
import java.awt.*;
public class TellerGUI {
    public TellerGUI(){
        JFrame f = new JFrame("Teller GUI");
        JPanel container = new JPanel(new GridLayout(2,2));
        JPanel container2 = new JPanel(new FlowLayout());
        JLabel textbalance = new JLabel("Balance");
        JTextArea ta_balance = new JTextArea("6000");
        JLabel textamount= new JLabel("Amount");
        JTextArea ta_amount = new JTextArea();
        JButton b_withdraw = new JButton("Withdraw");
        JButton b_deposit = new JButton("Deposit");
        JButton b_exit = new JButton("Exit");
        
        
        ta_amount.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ta_balance.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        textbalance.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        textamount.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ta_balance.setEditable(false);
        container.add(textbalance);
        container.add(ta_balance);
        container.add(textamount);
        container.add(ta_amount);
        
        container2.add(b_deposit);
        container2.add(b_withdraw);
        container2.add(b_exit);
        f.setLayout(new GridLayout(2, 1));
        f.add(container);
        f.add(container2);
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
