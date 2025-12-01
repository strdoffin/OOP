import java.util.*;
public class Sol3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your exercise time 1: ");
		int second1 = sc.nextInt();
		System.out.print("Enter your exercise time 2: ");
		int second2 = sc.nextInt();
		int second = second1 + second2;
		int hour = second / 3600;
		second %= 3600;
		int minute = second / 60;
		second %= 60;
		System.out.println("It is "+hour+" hours "+minute+" minutes and "+second+" seconds.");
		sc.close();
	}
}
