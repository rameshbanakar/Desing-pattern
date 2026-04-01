package Adapter;

public class BankAccount {
    public int balence=100;
    public int getBalence(){
        return this.balence;
    }
    public int addAmount(int amount){
        this.balence+=amount;
        return this.balence;
    }
}
