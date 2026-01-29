/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB207_05
 */
public class RedPotion extends Potion{
    public RedPotion(){
        super("Health Point Medicine");
    }
    public RedPotion(String name){
        super(name);
    }
    @Override
    public String getInfo(){
        return "The HP medicine price "+this.getPrice()+" baht.";
    }
    @Override
    public double getPrice(){
        return 200.0;
    }
    @Override
    public void eat(Player p){
        p.setHealthPoint(p.getHealthPoint() + 50);
    }
}
