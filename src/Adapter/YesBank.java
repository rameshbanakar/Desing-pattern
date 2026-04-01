package Adapter;

public class YesBank {
    public int checkBalence(BankAccount bankAccount){
        System.out.println("Yes Bank balence checking");
        return bankAccount.getBalence();
    }
}
