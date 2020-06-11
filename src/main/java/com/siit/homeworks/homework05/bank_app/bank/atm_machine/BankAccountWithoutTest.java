package com.siit.homeworks.homework05.bank_app.bank.atm_machine;

public class BankAccountWithoutTest {
    private String IBAN;
    private Card associatedCard;

    public BankAccountWithoutTest(String s){
        this.IBAN=s;
    }
    public BankAccountWithoutTest(String s, Card c){
        this.IBAN = s;
        this.associatedCard = c;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Card getAssociatedCard() {
        return associatedCard;
    }

    public void setAssociatedCard(Card associatedCard) {
        this.associatedCard = associatedCard;
    }

    public void printAccount(){
        if(associatedCard==null)
            System.out.println(IBAN);
        else
            System.out.println(IBAN+" the card "+associatedCard.getNumber());
    }
    public int addCard(Card c){
        if (this.associatedCard==null){
            this.associatedCard=c;
            return 1;
        }
        else {
            return 0;
        }
    }
}


