/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    
    public void eat(Food f){
        this.energy += Food.getEnergy();
    }
    public boolean buyFood(Seller s){
        Food d = s.sell(this);
        if (d != null){
            this.eat(d);
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(Employee e){
        return e.getName().equals(this.name);
    }
    @Override
    public String toString(){
        return ("My name is "+this.name+". \nI have "+this.energy+" energy left.\nI have a balance of "+this.getWallet().getBalance()+" baht.");
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return this.wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnergy(){
        return this.energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        return Employee.nationality;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
}
