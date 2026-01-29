/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class RedPotion extends Item{
    public RedPotion(){
        super("RedPotion");
    }
    @Override
    public void use(Character target){
        if (target.getHp() + 50 > target.getMaxHp()){
            target.setHp(target.getMaxHp());
        }else{
            target.setHp(target.getHp() + 50);
        }
        System.out.println("[Item]"+target.getName() +"uses Red Potion. HP recovered!");
    }
}
