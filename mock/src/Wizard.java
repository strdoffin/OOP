/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Wizard extends JobClass{
    public Wizard(){
        super("High Wizard");
    }
    @Override
    public void attack(Character attacker, Character target, Skill skill){
        if (attacker.getMana() < skill.getManaCost()){
            System.out.println("[X]"+attacker.getName()+" not enough mana!");
        }else{
            target.setHp(target.getHp() - (skill.getPower() + attacker.getAtk()));
            attacker.setMana(attacker.getMana() - skill.getManaCost());
            System.out.println("[Wizard] "+attacker.getName() + " casts "+skill.getName() + " on "+ target.getName() + "!");
        }
    }
}
