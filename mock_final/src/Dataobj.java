
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Dataobj implements Serializable {
    private String text = "";
    private int total = 0;
    public Dataobj(String text ,int total){
        this.text = text;
        this.total = total;
    }
    public String getText() {
        return text;
    }

    public int getTotal() {
        return total;
    }
    
}
