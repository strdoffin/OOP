/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockk;

/**
 *
 * @author yossawatimjai
 */
public abstract class Item {
    protected String name;
    public Item(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void use(Character target);
}
