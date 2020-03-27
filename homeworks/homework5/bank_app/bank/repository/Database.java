package homeworks.homework5.bank_app.bank.repository;

import java.util.ArrayList;

public class Database {

    public static ArrayList<String> allAccounts;

    public Database(){

        this.allAccounts=new ArrayList<String>();
    }
    public int addToDatabase(String s){
        if (Database.allAccounts.contains(s)) {
            return 0;
        }
        else {
            Database.allAccounts.add(s);
            return 1;
        }

    }

}
