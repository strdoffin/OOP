import java.util.*;
public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cash = sc.nextDouble();
        System.out.println("Total Price : " + cash);
		System.out.println("You got " + (int)cash/50 + " stamp(s)");
		sc.close();
    }
}
