/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockk;

/**
 *
 * @author yossawatimjai
 */
public class DoubleSlash extends Skill {
    public DoubleSlash(){
        super("Double Slash", 10, 15);
    }
    @Override
    public int getPower(){
        return super.getPower() * 2;
    }
}
