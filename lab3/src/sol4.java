/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
import java.util.*;
public class sol4 {
    public static void main(String[] args) {
        int n , number;
        String text = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        n = sc.nextInt();
        for (int i = 1;i <= n; i++){
            System.out.print("Enter digit "+i+": ");
            number = sc.nextInt();
            text += number;
        }
        System.out.println("Final Code = " + text);
    }
}
