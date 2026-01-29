/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockk;

/**
 *
 * @author yossawatimjai
 */
public abstract class Jobclass implements Combatable{
    protected String name;
    
    public void JobClass(){
        this.name = "Novice";
    }
    
    public Jobclass(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return ("Job" + this.name);
    }
}
