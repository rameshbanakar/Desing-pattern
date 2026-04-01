package Adapter.BankAdapters;
import Adapter.BankAccount;
import Adapter.YesBank;
public class YesBankAdapter implements Adapter {
    private YesBank bank=new YesBank();
    @Override
    public int fatchBalence(BankAccount account) {
        return bank.checkBalence(account);
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
