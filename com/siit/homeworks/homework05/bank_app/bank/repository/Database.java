package com.siit.homeworks.homework05.bank_app.bank.repository;

import java.util.ArrayList;

public class Database {

    public static ArrayList<String> allAccounts = new ArrayList<>();

    //public Database() {
    //   allAccounts = new ArrayList<>();
    // }
//    public Database() {
//
//        this.allAccounts = new ArrayList<String>();
//    }

    public static boolean addToDatabase(String iban) {
        if (allAccounts.contains(iban)) {
            return false;
        } else {
            return allAccounts.add(iban);
        }

    }

}
