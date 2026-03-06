
import java.awt.event.ActionEvent;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class PoringConstructor {
    private int poringcount = 1;
    private JFrame frame;
    private JButton b_add;
    public PoringConstructor(){
        frame = new JFrame();
        b_add = new JButton("Add");
        b_add.addActionListener((ActionEvent e) -> {
            Poring poring = new Poring(poringcount);
            poringcount++;
        });
        frame.add(b_add);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
