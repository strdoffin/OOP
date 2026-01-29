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
public class CalculatorTwoGUI {
    public CalculatorTwoGUI(){
        JFrame f = new JFrame("My Calculator");
        JPanel m = new JPanel(new BorderLayout());
        JPanel numpad = new JPanel(new GridLayout(4,4));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bplus = new JButton("+");
        JButton bminus = new JButton("-");
        JButton bmultiply = new JButton("X");
        JButton bdivide = new JButton("/");
        JButton bc = new JButton("c");
        JButton beq = new JButton("=");

        m.add(new JTextField(),BorderLayout.NORTH);
        numpad.add(b7);
        numpad.add(b8);
        numpad.add(b9);
        numpad.add(bplus);
        numpad.add(b4);
        numpad.add(b5);
        numpad.add(b6);
        numpad.add(bminus);
        numpad.add(b1);
        numpad.add(b2);
        numpad.add(b3);
        numpad.add(bmultiply);
        numpad.add(b0);
        numpad.add(bc);
        numpad.add(beq);
        numpad.add(bdivide);
        
        m.add(numpad,BorderLayout.CENTER);
        f.add(m);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
