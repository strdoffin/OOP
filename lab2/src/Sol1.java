import java.util.*;
public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        if (salary <= 50000.00){
            System.out.println(salary * 0.05);
        }else{
            System.out.println(salary * 0.1);
        }
    }
}
