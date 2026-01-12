/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount() {
        super(0,"");
        this.credit = 0;
        
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    @Override
    public void withdraw(double a){
        if ((this.getBalance() - a) >= 0){
            this.setBalance(this.getBalance() - a);
            System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.credit+".");
        }else if(((this.getBalance() - a) < 0) & (this.getCredit() + (this.getBalance() - a) >= 0)){
            this.setCredit(this.getCredit() - (this.getBalance() - a));
            super.setBalance(0);
            System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.credit+".");
        }else{
            System.out.println("Not enough money!");
        }
    }
    public void withdraw(String a){
        withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString(){
        return ("The "+ this.name + " account has "+this.balance +" baht and "+ this.credit + " credits.");
    }
}
