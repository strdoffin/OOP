/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class test {

    public static void main(String[] args) {
        Character p1 = new Character("Arthur");
        Character p2 = new Character("Merlin");
        p1.setJob(new Knight());
        p2.setJob(new Wizard());
        System.out.println("--- Battle Start ---");
        p1.useSkill(p2, new DoubleSlash());
        p2.useSkill(p1, new FireCharge());
        p2.setMana(10);
        p2.useSkill(p1, new FireCharge());

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n--- Item Phase ---");
        p1.useItem(new RedPotion());
        p2.useItem(new BluePotion());

        System.out.println(p1);
        System.out.println(p2);
    }

}
