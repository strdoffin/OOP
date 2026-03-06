
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class MyClock extends JLabel implements Runnable{

    @Override
    public void run() {
        
        while (true){
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            String timeText = String.format("%02d : %02d : %02d", hour, min, sec);
            this.setText(timeText);
            this.setFont(new Font("Serif", Font.BOLD, 18));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.getLogger(MyClock.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            
        }
    }
    
//    private int overalltime;
//    @Override
//    public void run() {
//        while (true){
//            
//            int hour = overalltime / 3600;
//            int min = (overalltime % 3600) / 60;
//            int sec = overalltime%60;
//            String timeText = String.format("%02d : %02d : %02d", hour, min, sec);
//            this.setText(timeText);
//            this.setFont(new Font("Serif", Font.BOLD, 18));
//            
//            try {
//                Thread.sleep(1000);
//                overalltime++;
//            } catch (InterruptedException ex) {
//                System.getLogger(MyClock.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
//            }
//            
//        }
//    }
//    private int overalltime;
//    private boolean paused = false;
//    
//    public void pauseClock() {
//        paused = true;
//    }
//
//    public void resumeClock() {
//        paused = false;
//    }
//    @Override
//    
//    public void run() {
//        while (true){
//            if(!paused){
//                int hour = overalltime / 3600;
//                int min = (overalltime % 3600) / 60;
//                int sec = overalltime%60;
//                String timeText = String.format("%02d : %02d : %02d", hour, min, sec);
//                this.setText(timeText);
//                this.setFont(new Font("Serif", Font.BOLD, 18));
//                overalltime++;
//            }
//            
//            
//            try {
//                Thread.sleep(1000);
//                
//            } catch (InterruptedException ex) {
//                System.getLogger(MyClock.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
//            }
//            
//        }
//    }
}
