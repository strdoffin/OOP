/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Car extends Vehicle{
    private String typeEngine;
    public void setTypeEngine(String t){
        this.typeEngine = t;
    }
    public String getTypeEngine(){
        return typeEngine;
    }
    public void showCarInfo(){
        System.out.println("Car engine is "+typeEngine+".");
        this.showInfo();
    }
    public void setCarInfo(int s, String t, String y){
        this.setFuel(s);
        this.setTopSpeed(t);
        this.setTypeEngine(y);
    }
    public void move(){
        if (this.getFuel() - 50 >= 0){
            System.out.println("Move.");
            this.setFuel(this.getFuel() - 50);
        }else{
            System.out.println("Please add fuel.");
        }
        
    }
}
