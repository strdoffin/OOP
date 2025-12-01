import java.util.*;
public class Sol9 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt(); 
		System.out.println(hour * 3600 + minute * 60);
		sc.close();
	}
}
