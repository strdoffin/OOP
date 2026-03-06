
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Poring {
    private JFrame frame;
    
    private JLabel poring, number;
    private JPanel container;
    private ImageIcon poringimg;
    private Image poringimgscale;
    private int poringnum;
    public Poring(){
        this(0);
    }
    public Poring(int num){
        this.poringnum = num;
        frame = new JFrame();
        
        poringimg = new ImageIcon(getClass().getResource("/polo.png"));
        poringimgscale = poringimg.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        poring = new JLabel(new ImageIcon(poringimgscale));
        number = new JLabel(this.poringnum+"");
        container = new JPanel(new FlowLayout());
        
        poring.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                frame.dispose();
            }
        });
        container.add(poring);
        container.add(number);
        frame.add(container);
//        frame.pack();
        frame.setSize(300,200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
}
