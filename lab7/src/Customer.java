/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yossawatimjai
 */
public class Customer {
    private String firstname;
    private String lastname;
    private CheckingAccount acct;
    public Customer(){
        this("","",null);
    }
    public Customer(String firstname, String lastname){
        this(firstname,lastname,null);
    }
    public Customer(String firstname, String lastname, CheckingAccount acct){
        this.firstname = firstname;
        this.lastname = lastname;
        this.acct = acct;
    }
    public void setFirstName(String firstname){
        this.firstname = firstname;
    }
    public String getFirstName(){
        return this.firstname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public String getLastName(){
        return this.lastname;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return this.acct;
    }
    @Override
    public String toString(){
        if (this.getAcct() == null){
            return (this.firstname+" "+this.lastname+" doesn't have account.");
        }
        return ("The "+ this.firstname + " account has "+this.getAcct().getBalance() +" baht and "+ this.getAcct().getCredit() + " credits.");
    }
    public boolean equals(Customer c){
        return (this.firstname.equals(c.firstname) & this.lastname.equals(c.lastname));
    }
}
