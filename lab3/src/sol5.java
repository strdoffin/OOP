/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
import java.util.*;
public class sol5 {
    public static void main(String[] args) {
        int n,number,excellent = 0, good = 0, fair = 0, poor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        for (int i = 1;i <= n;i++){
            System.out.print("Enter score for student "+i+": ");
            number = sc.nextInt();
            if (number >= 80){
                System.out.println("Excellent");
                excellent+=1;
            }else if(number >= 60){
                System.out.println("Good");
                good+=1;
            }else if(number >= 50){
                System.out.println("Fair");
                fair+=1;
            }else{
                System.out.println("Poor");
                poor+=1;
            }
        }
        System.out.println("Summary:");
        System.out.println("Excellent: " + excellent);
        System.out.println("Good: " + good);
        System.out.println("Fair: " + fair);
        System.out.println("Poor: " + poor);
    }
}
