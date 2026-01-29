/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
import javax.swing.*;

public class MDIFromGUI {
    public MDIFromGUI(){
        JFrame f = new JFrame("SubMenuItem Demo");
        JDesktopPane desktopPane = new JDesktopPane();
        JInternalFrame frame1 = new JInternalFrame("Application 1",true,true,true,true);
        JInternalFrame frame2 = new JInternalFrame("Application 2",true,true,true,true);
        JInternalFrame frame3 = new JInternalFrame("Application 3",true,true,true,true);
        
        frame1.setSize(300,170);
        frame2.setSize(300,120);
        frame3.setSize(400,200);
        frame1.setLocation(20, 200);
        frame2.setLocation(60, 50);
        frame3.setLocation(300, 150);
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenu m3 = new JMenu("View");
        JMenu sm1_1 = new JMenu("New");
        JMenuItem sm1_2 = new JMenuItem("Open");
        JMenuItem sm1_3 = new JMenuItem("Save");
        JMenuItem sm1_4 = new JMenuItem("Exit");
        JMenuItem sm1_1_1 = new JMenuItem("Window");
        JMenuItem sm1_1_2 = new JMenuItem("Message");
        sm1_1.add(sm1_1_1);
        sm1_1.addSeparator();
        sm1_1.add(sm1_1_2);
        m1.add(sm1_1);
        m1.add(sm1_2);
        m1.addSeparator();
        m1.add(sm1_3);
        m1.addSeparator();
        m1.add(sm1_4);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        f.add(desktopPane);
        f.setJMenuBar(mb);
        f.setSize(800,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
