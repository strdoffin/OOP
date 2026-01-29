/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Skill {
    private String name;
    private int manaCost;
    private int power;
    public Skill(){
        this("Basic",0,10);
    }
    public Skill(String name, int manaCost, int power){
        this.name = name;
        this.manaCost = manaCost;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getPower() {
        return power;
    }
}
