package Adapter;

public class IciciBank {
    public int getBalence(BankAccount bankAccount){
        System.out.println("ICICI Bank balence checking");
        return bankAccount.getBalence();
    }
}
