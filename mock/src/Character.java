/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    private JobClass job;
    public Character(String name){
        this(name,100,50,10,5);
    }
    public Character(String name,int hp, int mana, int atk, int def){
        this.hp  = hp;
        this.maxHp = 100;
        this.mana = mana;
        this.atk = atk;
        this.def = def;
        this.job = null;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJob(JobClass job) {
        this.job = job;
    }
    
    public int getHp() {
        return hp;
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
    
    public void useSkill(Character target, Skill skill){
        this.job.attack(this, target, skill);
    }
    public void useItem(Item item){
        item.use(this);
    }
    @Override
    public String toString(){
        return ("Name: "+this.name+" | HP: "+this.hp+"/"+this.maxHp+" | MP: "+this.mana+ " | Job: "+this.job.getName());
    }
}
