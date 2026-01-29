/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class FireCharge extends Skill{
    public FireCharge(){
        super("FireCharge", 25, 30);
    }
    @Override
    public int getPower(){
         System.out.println(">> Chanting Fire Spell...");
         return super.getPower();
    }
}
