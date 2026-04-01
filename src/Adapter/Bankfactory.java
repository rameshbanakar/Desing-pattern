package Adapter;
import Adapter.BankAdapters.Adapter;
import Adapter.BankAdapters.IciciBankAdapter;
import Adapter.BankAdapters.YesBankAdapter;

public class Bankfactory {
    public static Adapter getAdapter(String bankName){
        if(bankName.equalsIgnoreCase("icici")){
            return new IciciBankAdapter();
        } else if (bankName.equalsIgnoreCase("yesbank")) {
            return new YesBankAdapter();
        }
        return null;
    }
}
