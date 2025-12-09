/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
import java.util.*;
public class sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            if (password.equals("PASS2025")){
                System.out.println("Access granted.");
                break;
            }else{
                System.out.println("Try again.");
            }
        }
        sc.close();
    }
}
