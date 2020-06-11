package com.siit.homeworks.homework05.bank_app.bank.atm_machine;

public class CardWithoutTest {

    private String number;
    private double balance;
    private String customerName;
    private String PIN;


    public CardWithoutTest(String number, double balance, String customerName, String PIN){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.PIN = PIN;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }


    public void changePIN(String oldPIN, String newPIN){
        if(oldPIN.equals(this.PIN)){
            if (newPIN.length() == 4) {
                this.PIN = newPIN;
            }
        } else {
            System.out.println("The PIN introduced is incorrect");
        }
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getPIN() {
        return PIN;
    }

    public void PIN(String PIN) {
        this.PIN = PIN;
    }



}
