/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Knight extends JobClass{
    public Knight(){
        super("Royal Knight");
    }
    @Override
    public void attack(Character attacker, Character target, Skill skill){
        target.setHp(target.getHp() - (skill.getPower() + attacker.getAtk() - target.getDef()));
        attacker.setMana(attacker.getMana() - skill.getManaCost());
        System.out.println("[Knight]"+attacker.getName()+" attacks "+target.getName()+" with "+skill.getName()+"!");
    }
}
