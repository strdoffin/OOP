/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockk;

/**
 *
 * @author yossawatimjai
 */
public class Character {
    private String name;
    private int hp;
    private int maxHp;
    private int mana;
    private int atk;
    private int def;
    private Jobclass job;
    
    public int getHp() {
        return hp;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAtk() {
        return atk;
    }


    public int getDef() {
        return def;
    }

    
    public void Character(String name){
      
    }
    
    public void Character(String name , int hp , int ana , int atk , int def){
    
    }
    
    public void useSkill (Character target , Skill skill){
        
    }
    
    public void useItem (Item item){
        
    }
    
    public String toString(){
        
    }
    
}

