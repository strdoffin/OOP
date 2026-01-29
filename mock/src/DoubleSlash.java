/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class DoubleSlash extends Skill{
    public DoubleSlash(){
        super("DoubleSlash",10,15);
    }
    @Override
    public int getPower(){
         return (super.getPower() * 2);
    }
}
