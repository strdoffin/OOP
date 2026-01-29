/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB207_05
 */
public class Swordman extends Player{
    public Swordman(String name, double healthPoint , double energyPoint , double cash , String gender){
        super(name, healthPoint,energyPoint,cash, gender);
    }
    public Potion buy(Alchemist a, String potionName){
        if (potionName.equals("Health Point Medicine") | potionName.equals("Energy Point Medicine")| potionName.equals("High Health Point Medicine")){
            return a.sell(this, potionName);
        }
        System.out.println("The "+potionName+" does not found in the list.");
        return null;
    }
    public void fighting(Swordman s){
        if (this.getEnergyPoint() < 20){
            System.out.println(this.getName()+" is not enough the energy "+this.getEnergyPoint()+".");
        }
        else{
            s.setHealthPoint(s.getHealthPoint() - 50);
            this.setEnergyPoint(this.getEnergyPoint() - 20);
            System.out.println(this.getName()+"("+this.getHealthPoint()+","+this.getEnergyPoint()+") fights with "+s.getName()+"("+s.getHealthPoint()+","+s.getEnergyPoint()+").");
        }
    }
    public void fighting(Swordman s, int round){
        int cnt = 1;
        while (s.getHealthPoint() > 0 & cnt <= round){
            System.out.print("Round "+cnt+":");
            this.fighting(s);
        }
        if (s.getHealthPoint() <= 0){
            System.out.println( s.getName()+" is zero HP.");
        }
    }
}
