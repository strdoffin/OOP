/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class SeniorProgrammer extends Programmer{
    @Override
    public void coding(String str){
        if (this.getEnergy() >= 10){
            System.out.println("I'm coding about "+str);
        }else{
            System.out.println("ZzZzZz");
        }
        this.setHappiness(this.getHappiness() - 5);
        this.setEnergy(this.getEnergy() - 5);
    }
    public void coding(String str,int num){
        for(int i = 0; i<num ; i++){
            this.coding(str);
        }
    }
    public void compliment(Programmer p){
        p.setHappiness(p.getHappiness() + 20);
        System.out.println(p.getName() + " in a good mood");
    }
    public void blame(Programmer p){
        p.setHappiness(p.getHappiness() - 20);
        System.out.println(p.getName() + " in a bad mood");
    }
}
