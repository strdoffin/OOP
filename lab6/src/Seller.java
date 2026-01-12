/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Seller extends Employee{
    public Food sell(Employee e){
        if (e.getWallet().getBalance() >= Food.getPrice()){
            double s_balance = this.getWallet().getBalance() + Food.getPrice();
            double e_balance = e.getWallet().getBalance() - Food.getPrice();
            e.getWallet().setBalance(e_balance);
            this.getWallet().setBalance(s_balance);
            return new Food( );
        }
        else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
