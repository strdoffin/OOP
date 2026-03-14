
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class BookAdd {
    private JFrame frame = new JFrame("");
    private JPanel container = new JPanel(new BorderLayout());
    private JPanel sub_con = new JPanel(new GridLayout(3,2));
    private JPanel sub_con2 = new JPanel(new FlowLayout());
    
    private JLabel t_name = new JLabel("Name");
    private JLabel t_price = new JLabel("Price");
    private JLabel t_type = new JLabel("Type");
    private String[] type_list = {"General", "Computer", "Math&Sci","Photo"};
    private JTextField tf_name = new JTextField();
    private JTextField tf_price = new JTextField();
    private JComboBox cb_type = new JComboBox(type_list);
    private JButton b_insert = new JButton("Insert");
    public BookAdd(BookView parent){
        cb_type.setSelectedIndex(0);
        
        sub_con.add(t_name);
        sub_con.add(tf_name);
        sub_con.add(t_price);
        sub_con.add(tf_price);
        sub_con.add(t_type);
        sub_con.add(cb_type);
        container.add(sub_con,BorderLayout.CENTER);
        
        b_insert.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Book b = new Book(tf_name.getText(), Double.parseDouble(tf_price.getText()), (String) cb_type.getSelectedItem());
                parent.data.add(b);
                JOptionPane.showMessageDialog(frame,"Done it.");
                parent.tf_name.setText(b.getName());
                parent.tf_price.setText(b.getPrice()+"");
                parent.cb_type.setSelectedItem(b.getType());
                parent.book_order.setText(parent.data.size()+"");
                
                frame.dispose();
            }
        });
        sub_con2.add(b_insert);
        container.add(sub_con2,BorderLayout.SOUTH);
        frame.add(container);
        
        frame.setVisible(true);
        
        frame.pack();
    }
}
