/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class BluePotion extends Item {

    public BluePotion() {
        super("Blue Potion");
    }

    @Override
    public void use(Character target) {
            target.setMana(target.getMana()+30);
            System.out.println("[Item]" + target.getName() + "uses Blue Potion. Mana restored!");
    }
}
