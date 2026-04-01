package Adapter;

import Adapter.BankAdapters.Adapter;
import Adapter.BankAdapters.IciciBankAdapter;
import Adapter.BankAdapters.YesBankAdapter;

import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the bank Name:");
        String bankName= scan.next();
        BankAccount account=new BankAccount();
        Adapter adapter=Bankfactory.getAdapter(bankName);
        PhonePay ph=new PhonePay(adapter);
        System.out.println(ph.fecthBalence(account));
    }
}
