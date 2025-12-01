import java.util.*;
public class Sol5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (°C):");
        double temp = sc.nextDouble();
        System.out.print("Enter humidity (%):");
        double humidity = sc.nextDouble();
        if (temp > 37.5){
            System.out.println("Warning: High temperature!");
        }else{
            System.out.println("Temperature normal.");
        }
        if (humidity > 80){
            System.out.println("Humidity is too high.");
        }else{
            System.out.println("Humidity is acceptable");
        }
    }
}
