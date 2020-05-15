package homework11.exercise3;

import lombok.Data;

@Data
public class Transaction {

    private final Trader trader;

    private final int value;

    private final int year;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.value = value;
        this.year = year;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }
}
