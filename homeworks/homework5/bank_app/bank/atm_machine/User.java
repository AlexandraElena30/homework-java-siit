package homeworks.homework5.bank_app.bank.atm_machine;

import homeworks.homework5.bank_app.bank.repository.Database;

import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<BankAccount> accounts;

    public User(String name, ArrayList<BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }
    public User(String name) {
        this.name = name;
        this.accounts = new ArrayList<BankAccount>();
    }

      public void addAccount(String iban, Database db) {
        //Check if is in database+add in db
        if (db.addToDatabase(iban)==0) {
            System.out.println("The specified IBAN is already in the database, please try another!");
        }
        else{
            BankAccount b = new BankAccount(iban);
            this.accounts.add(b);
        }
    }
    public void addAccount(String iban, Database db, Card c) {
        //Check if is in database+add in db
        if (db.addToDatabase(iban)==0) {
            System.out.println("The specified IBAN is already in the database, please try another!");
        }
        else{
            BankAccount b = new BankAccount(iban,c);
            this.accounts.add(b);
        }
    }
    public void printAllAccounts(){
        for (BankAccount auxAccount:this.accounts){
            auxAccount.printAccount();
        }
    }
    public void addNewCard(String Iban, Card c){
        int found=0;
        for (BankAccount auxAccount:this.accounts){
            if (auxAccount.getIBAN().equals(Iban)){
                found=1;
                if (auxAccount.addCard(c)==1)
                    System.out.println("The card was added successfully for account: "+Iban);
                else
                    System.out.println("This account "+Iban+" has already an associated card");
            }
        }
        if(found==0)
            System.out.println("You entered a wrong account iban");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }
}
