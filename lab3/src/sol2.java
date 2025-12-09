/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
import java.util.*;
public class sol2 {
    public static void main(String[] args) {
        int odd = 0,even = 0,number;
        Scanner sc = new Scanner(System.in);
        while (true){
            number = sc.nextInt();
            if (number == -1){
                break;
            }else if (number % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Odd number = "+odd+" and Even number = "+even);
    }
}
