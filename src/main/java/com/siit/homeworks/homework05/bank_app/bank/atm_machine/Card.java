package com.siit.homeworks.homework05.bank_app.bank.atm_machine;

//import lombok.AllArgsConstructor;


public class Card {

    private static String number;
    //private String number;
    private double balance;
    private String customerName;
    private String PIN;


    public Card(String number, double balance, String customerName, String PIN){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.PIN = PIN;
    }

    double deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
        return depositAmount;
    }

   Double withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
        return withdrawalAmount;
    }


    String changePIN(String oldPIN, String newPIN){
        if(oldPIN.equals(this.PIN)){
            if (newPIN.length() == 4) {
                this.PIN = newPIN;
            }
        } else {
            System.out.println("The PIN introduced is incorrect");
        }
        return newPIN;
    }



    static String getNumber() {
        return number;
    }

    String setNumber(String number) {
        this.number = number;
        return number;
    }

    double getBalance() {
        return balance;
    }

    double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    String getCustomerName() {
        return customerName;
    }

    String setCustomerName(String customerName) {
        this.customerName = customerName;
        return customerName;
    }


    public String getPIN() {
        return PIN;
    }

    public void PIN(String PIN) {
        this.PIN = PIN;
    }



}
