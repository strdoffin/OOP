/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */

import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
public class ClockPanel extends JPanel implements Runnable{
    private JLabel datetext = new JLabel();
    private JLabel timetext = new JLabel();
    public ClockPanel(){
        this.setLayout(new GridLayout(2,1));
        datetext.setHorizontalAlignment(JLabel.CENTER);
        timetext.setHorizontalAlignment(JLabel.CENTER);
        timetext.setFont(new Font("Serif",Font.PLAIN,50));
        this.add(datetext);
        this.add(timetext);
    }
    @Override
    public void run() {
        while(true){            
            
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String date = now.format(dateFormatter);
            String time = now.format(timeFormatter);

            datetext.setText(date);
            timetext.setText(time);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
