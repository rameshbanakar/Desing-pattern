package Adapter.BankAdapters;
import Adapter.BankAccount;
public interface Adapter {
    int fatchBalence(BankAccount account);
    int addMoney();
    int sendMoney();
}