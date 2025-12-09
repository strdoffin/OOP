/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
import java.util.*;
public class sol3 {
    public static void main(String[] args) {
        int n, total = 0 , number, money;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        n = sc.nextInt();
        for (int i = 1;i <= n; i++){
            System.out.print("Enter number for item "+i+": ");
            number = sc.nextInt();
            total += number;
        }
        System.out.println("Total = "+total);
        System.out.print("Enter amount paid: ");
        money = sc.nextInt();
        System.out.println("Change = "+ (money - total));
        
    }
}
