package Adapter;

import Adapter.BankAdapters.Adapter;

public class PhonePay {
    private Adapter bank;

    public PhonePay(Adapter bank) {
        this.bank = bank;
    }

    public int fecthBalence(BankAccount account) {
        return bank.fatchBalence(account);
    }

}
