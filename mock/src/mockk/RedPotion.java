/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockk;

/**
 *
 * @author yossawatimjai
 */
public class RedPotion extends Item {
    public RedPotion() {
        super("Red Potion");
    }
    
    @Override
    public void use(Character target){
        target.setHp(target.getHp()+ 50);
        System.out.println("[Item]" + target.getName()  + "uses Red Potion. HP recovered!");
    }
}
