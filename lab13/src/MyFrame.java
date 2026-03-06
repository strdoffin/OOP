
//import java.awt.event.ActionEvent;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class MyFrame{
    private JFrame frame;
    private JPanel container;
    private MyClock clock;
    private JButton pause, resume;
    private Thread t;
    public MyFrame(){
        frame = new JFrame("My Frame");
        container = new JPanel();
        clock = new MyClock();
        t = new Thread(clock);
        
        t.start();
//        pause = new JButton("Pause");
//        resume = new JButton("Resume");
//        pause.addActionListener((ActionEvent e) -> {
//            clock.pauseClock();
//        });
//        resume.addActionListener((ActionEvent e) -> {
//            clock.resumeClock();
//        });
        
//        container.add(pause);
//        container.add(resume);
        container.add(clock);
        frame.add(container);
        frame.setSize(300,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
