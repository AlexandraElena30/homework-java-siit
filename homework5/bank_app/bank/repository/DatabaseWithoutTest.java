package homework5.bank_app.bank.repository;

import java.util.ArrayList;

public class DatabaseWithoutTest {

    public static ArrayList<String> allAccounts;

    static {
        allAccounts = new ArrayList<>();
    }
//    public Database() {
//
//        this.allAccounts = new ArrayList<String>();
//    }

    public boolean addToDatabase(String iban) {
        if (allAccounts.contains(iban)) {
            return false;
        } else {
           return allAccounts.add(iban);
        }

    }

}
