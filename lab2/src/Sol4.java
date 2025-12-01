import java.util.*;
public class Sol4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA:");
        double gpa = sc.nextDouble();
        System.out.print("Enter Family income:");
        double salary = sc.nextDouble();
        if (gpa >= 3.5)
        {
            if (salary <= 15000){
                System.out.println("You are eligible for the scholarship.");
            }else{
                System.out.println("You are not eligible for the scholarship.");
            }
        }else
        {
            System.out.println("You are not eligible for the scholarship.");
        }
    }
}
