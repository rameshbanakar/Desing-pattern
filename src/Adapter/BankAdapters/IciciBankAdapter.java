package Adapter.BankAdapters;

import Adapter.BankAccount;
import Adapter.IciciBank;

public class IciciBankAdapter implements Adapter {
    private IciciBank bank = new IciciBank();

    @Override
    public int fatchBalence(BankAccount account) {
        return bank.getBalence(account);
    }

    @Override
    public int addMoney() {
        return 0;
    }

    @Override
    public int sendMoney() {
        return 0;
    }
}
