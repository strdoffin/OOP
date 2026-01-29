/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Player {
    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    public Player(String name){
        this.name = name;
    }
    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName(){
        return this.name;
    }
    public int getHP() {
        return hp;
    }
    public void setHP(int hp) {
        if (hp < 0){
            this.hp = 0;
        }else if (hp > 20){
            this.hp = 20;
        }else{
            this.hp = hp;
        }
    }
    public int getAttackDamage(){
        return this.attackDamage;   
    }
    public int getMana() {
        return mana;
    } 
    public void setMana(int mana) {
        if (mana < 0){
            this.mana = 0;
        }else if (mana > 50){
            this.mana = 50;
        }else{
            this.mana = mana;
        }
    }
    public Houses getHouses() {
        return houses;
    }
    public void setHouses(Houses houses) {
        this.houses = houses;
    }
    @Override
    public String toString(){
        return ("[Player] : "+this.getName() + " HP: "+this.getHP()+" Mana: "+this.getMana()+" || "+this.getHouses());
    }
    public boolean equals(Player player){
        return this.getName().equals(player.getName()) & this.getHouses().equals(player.getHouses());
    }
    public void attack(Player target, Spell spell){
        if (this.getHouses() instanceof Gryffindor){
            ((Gryffindor)this.houses).attackSpell(this, target, spell);
        }else if (this.getHouses() instanceof Hufflepuff){
            ((Hufflepuff)this.houses).attackSpell(this, target, spell);
        }
        if (target.getHP() == 0){
            System.out.println("[DEAD]: "+target.getName()+" was killed by "+this.name);
        }
    }
    public void protectFromPlayer(Player target){
        if (this.getHouses() instanceof Gryffindor){
            ((Gryffindor)this.houses).defense(this, target);
        }else if (this.getHouses() instanceof Hufflepuff){
            ((Hufflepuff)this.houses).defense(this, target);
        }
    }
}
