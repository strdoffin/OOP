import java.util.*;
public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        String type = sc.next();
        switch (type) {
            case "A":
                money = money * 1.015;
                break;
            case "B":
                money = money * 1.02;
                break;
            case "C":
                money = money * 1.015;
                break;
            case "X":
                money = money * 1.05;
                break;
        }        
        System.out.println("Your total money in one year = "+ (int)money);
    }
}
