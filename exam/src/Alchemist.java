/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB207_05
 */
public class Alchemist extends Player {

    private double experience;

    public Alchemist(String name, double healthPoint, double energyPoint, double cash, String gender) {
        super(name, healthPoint, energyPoint, cash, gender);
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Potion craftPotion(String potionName) {
        switch (potionName) {
            case "Health Point Medicine" -> {
                if (this.getEnergyPoint() < 50) {
                    System.out.println(this.getName() + " is not enough the energy point.");
                    return null;
                } 
                else {
                    this.setEnergyPoint(this.getEnergyPoint() - 50);
                    this.setExperience(this.getExperience() + 5);
                    System.out.println(this.getName() + " has the energy point at " + this.getEnergyPoint() + " and the experience point at " + this.getExperience() + ".");
                    return new RedPotion();
                }
            }
            case "Energy Point Medicine" -> {
                if (this.getEnergyPoint() < 100) {
                    System.out.println(this.getName() + " is not enough the energy point.");
                    return null;
                } 
                else {
                    this.setEnergyPoint(this.getEnergyPoint() - 100);
                    this.setExperience(this.getExperience() + 8);
                    System.out.println(this.getName() + " has the energy point at " + this.getEnergyPoint() + " and the experience point at " + this.getExperience() + ".");
                    return new BluePotion();
                }
            }
            case "High Health Point Medicine" -> {
                if (this.getEnergyPoint() < 150) {
                    System.out.println(this.getName() + " is not enough the energy point.");
                    return null;
                } 
                else {
                    this.setEnergyPoint(this.getEnergyPoint() - 150);
                    this.setExperience(this.getExperience() + 9);
                    System.out.println(this.getName() + " has the energy point at " + this.getEnergyPoint() + " and the experience point at " + this.getExperience() + ".");
                    return new HiPotion();
                }
            }
            default -> {
                System.out.println("Incorrect Potion Name.");
                return null;
            }
        }

    }

    public Potion sell(Player p, String potionName) {
        switch (potionName) {
            case "Health Point Medicine" -> {
                if (p.getCash() < 200.0) {
                    System.out.println(p.getName() + " is not enough money.");
                    return null;
                } 
                else {
                    p.setCash(p.getCash() - 200.0);
                    this.setCash(this.getCash() + 200.0);
                    return this.craftPotion(potionName);
                }
            }
            case "Energy Point Medicine" -> {
                if (p.getCash() < 300.0) {
                    System.out.println(p.getName() + " is not enough money.");
                    return null;
                } 
                else {
                    p.setCash(p.getCash() - 300.0);
                    this.setCash(this.getCash() + 300.0);
                    return this.craftPotion(potionName);
                }
            }
            case "High Health Point Medicine" -> {
                if (p.getCash() < 500.0) {
                    System.out.println(p.getName() + " is not enough money.");
                    return null;
                } 
                else {
                    p.setCash(p.getCash() - 500.0);
                    this.setCash(this.getCash() + 500.0);
                    return this.craftPotion(potionName);
                }
            }
            default -> {
                System.out.println("The potion name is incorrect.");
                return null;
            }
        }
    }
}
