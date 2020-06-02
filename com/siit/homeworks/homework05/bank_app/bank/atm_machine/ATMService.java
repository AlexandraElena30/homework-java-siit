package com.siit.homeworks.homework05.bank_app.bank.atm_machine;


import com.siit.homeworks.homework05.bank_app.bank.repository.Database;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ATMService {

    public static void main(String[] args) {
        Database db = new Database();
        User user1 = new User("User1");
        Card bobsAccount = new Card("123456", 0.0, "Bob Jr.", "1234");
        Card bobsAccount2 = new Card("99999", 0.0, "Bob Jr.", "1234");

        user1.addAccount("4790", db, bobsAccount);
        user1.addAccount("4790", db);
        user1.addAccount("4720", db);
        user1.addNewCard("4720", bobsAccount2);
        user1.addNewCard("47200", bobsAccount2);

        bobsAccount.changePIN("1234", "2345");
        bobsAccount.deposit(100.5);
        bobsAccount.withdrawal(55.0);
        user1.printAllAccounts();
        System.out.println(bobsAccount.getPIN());


    }



}


