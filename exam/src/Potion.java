/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB207_05
 */
public abstract class Potion implements Eatable{
    private final String NAME;
    public Potion(String name){
        this.NAME = name;
    }
    public abstract String getInfo();
    public String getName(){
        return this.NAME;
    }
    public abstract double getPrice();
}
