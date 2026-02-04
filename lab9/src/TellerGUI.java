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
import java.awt.event.*;
public class TellerGUI implements ActionListener{
    private JFrame f;
    private JPanel container1, container2;
    private JLabel textbalance, textamount;
    private JTextArea ta_balance, ta_amount;
    private JButton b_withdraw,b_deposit,b_exit;
    private Account myAccount = new Account();
    public TellerGUI(){
        f = new JFrame("Teller GUI");
        container1 = new JPanel(new GridLayout(2,2));
        container2 = new JPanel(new FlowLayout());
        textbalance = new JLabel("Balance");
        ta_balance = new JTextArea(String.valueOf(myAccount.balance));
        textamount= new JLabel("Amount");
        ta_amount = new JTextArea();
        b_withdraw = new JButton("Withdraw");
        b_deposit = new JButton("Deposit");
        b_exit = new JButton("Exit");
        
        b_exit.addActionListener(this);
        b_deposit.addActionListener(this);
        b_withdraw.addActionListener(this);
        ta_amount.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ta_balance.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        textbalance.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        textamount.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ta_balance.setEditable(false);
        
        container1.add(textbalance);
        container1.add(ta_balance);
        container1.add(textamount);
        container1.add(ta_amount);
        
        container2.add(b_deposit);
        container2.add(b_withdraw);
        container2.add(b_exit);
        f.setLayout(new GridLayout(2, 1));
        f.add(container1);
        f.add(container2);
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b_exit){
            System.exit(0);
        } else if (e.getSource() == b_deposit){
            myAccount.deposit(Double.parseDouble(ta_amount.getText()));
            ta_balance.setText(String.valueOf(myAccount.balance));
            ta_amount.setText("");
        } else if (e.getSource() == b_withdraw){
            if (myAccount.withdraw(Double.parseDouble(ta_amount.getText())) != 0){
                ta_balance.setText(String.valueOf(myAccount.balance));
            }
            ta_amount.setText("");
        }
    }
}
