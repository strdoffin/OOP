/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
import java.util.*;
public class sol7 {
    public static void main(String[] args) {
        int bank = 0,times = 0 , number;
        Scanner sc = new Scanner(System.in);
        while (bank < 1000){
            System.out.print("Enter deposit amount: ");
            number = sc.nextInt();
            bank+=number;
            times++;
        }
        System.out.println("Target reached!");
        System.out.println("Total amount saved = " + bank);
        System.out.println("Number of deposits = "+ times);
        
    }
}
