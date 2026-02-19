
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author yossawatimjai
 */
public class CalculatorSample implements ActionListener {

    private JFrame f;
    private JPanel m;
    private JPanel numpad;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bplus, bminus, bmultiply, bdivide, bc, beq;
    private JTextField box;
    private double value = 0;
    private String op;

    public CalculatorSample() {
        f = new JFrame("My Calculator");
        m = new JPanel(new BorderLayout());
        numpad = new JPanel(new GridLayout(4, 4));
        box = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bplus = new JButton("+");
        bminus = new JButton("-");
        bmultiply = new JButton("X");
        bdivide = new JButton("/");
        bc = new JButton("c");
        beq = new JButton("=");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bc.addActionListener(this);
        bplus.addActionListener(this);
        bminus.addActionListener(this);
        bmultiply.addActionListener(this);
        bdivide.addActionListener(this);
        beq.addActionListener(this);
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

        m.add(box, BorderLayout.NORTH);
        m.add(numpad, BorderLayout.CENTER);
        f.add(m);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().charAt(0) <= '9' & e.getActionCommand().charAt(0) >= '0') {
            box.setText(box.getText() + e.getActionCommand().charAt(0));
        } else if (e.getSource() == bc) {
            box.setText("");
            value = 0;
            op = null;

        } else if (e.getSource() == beq) {
            double secondvalue = Double.parseDouble(box.getText());
            switch (op) {
                case "+" ->
                    value += secondvalue;
                case "-" ->
                    value -= secondvalue;
                case "X" ->
                    value *= secondvalue;
                case "/" ->
                    value /= secondvalue;
                default -> {
                    return;
                }
            }
            box.setText(String.valueOf(value));
            op = null;
        } else {
            if (!box.getText().isEmpty()) {

                if (op != null) {
                    double secondvalue = Double.parseDouble(box.getText());
                    switch (op) {
                        case "+" ->
                            value += secondvalue;
                        case "-" ->
                            value -= secondvalue;
                        case "X" ->
                            value *= secondvalue;
                        case "/" ->
                            value /= secondvalue;
                        default -> {
                        }
                    }
                }else{
                    value = Double.parseDouble(box.getText());
                }
                op = e.getActionCommand();
                box.setText("");
            }
        }
    }

}
