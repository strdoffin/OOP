/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
import java.util.*;
public class sol6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character;
        String all = "";
        String consonent = "";
        while (true){
            System.out.print("Enter a character: ");
            character = sc.next().charAt(0);
            if (character == 'z'){
                break;
            }
            if (character >= 97 & character <= 122){
                if (character != 'a' & character != 'e' & character != 'i' & character != 'o' & character != 'u'){
                    consonent += character;
                }
                all += character;
            }else{
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
            }
        }
        System.out.println("All characters entered: "+all);
        System.out.println("Consonents only: "+consonent);
    }
}
