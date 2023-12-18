
package designclasses;

public class BankAccount {
    private String AccNum;
    private String AccName;
    private double balance;
    
    // Constructor 1 //
    public BankAccount(){
        System.out.println("No information is given.\n\n");
    }
    // Constructor 2 //
    public BankAccount(String a, String b,double c){
        this.AccNum = a;
        this.AccName = b;
        this.balance = c;
    }
    
    // Methods //
    public void displayInfo(){
        System.out.println("Name: "+AccName);
        System.out.println("Number: "+AccNum);
        System.out.println("Balance: "+balance);
    }
    public void deposit(double x){
        System.out.println("Previous Balance: "+ balance);
        balance +=x;
        System.out.println("After Deposit Balance: "+ balance);
    }
    public void withdraw(double x){
        System.out.println("Previous Balance: "+ balance);
        balance -=x;
        System.out.println("After withdraw Balance: "+ balance);
    }
    public void checkBalance(){
        if(balance > 100){
            System.out.println("Rich");
        }else{
            System.out.println("Gorib");
        }
    }
    
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba = new BankAccount("123", "Anik",34949);
        ba.displayInfo();
        ba.deposit(1000);
        ba.withdraw(200);
        ba.checkBalance();
    }
}