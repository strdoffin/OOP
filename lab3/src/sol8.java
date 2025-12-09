/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
import java.util.*;
public class sol8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number , cnt = 0, max = 0, min = 0; 
        while (true){
            System.out.print("Enter number (-1 to stop): ");
            number = sc.nextInt();
            if (number == -1)
                break;
            if (cnt == 0){
                max = number;
                min = number;
            }
            if (number > max)
                max = number;
            if(number < min)
                min = number;
            cnt++;
        }
        if (cnt == 0){
            System.out.println("No numbers were entered.");
            return;
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}
