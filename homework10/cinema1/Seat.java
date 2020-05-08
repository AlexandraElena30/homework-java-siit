package homework10.cinema1;

import java.math.BigDecimal;

public class Seat {
    private String seatNumber;
    private boolean reserved;
    private BigDecimal price;

    public Seat(String seatNumber, boolean reserved, BigDecimal price) {
        this.seatNumber = seatNumber;
        this.reserved = reserved;
        this.price = price;
    }

    public Seat(String seatNumber,  BigDecimal price) {
        this.seatNumber = seatNumber;
        this.reserved = false;
        this.price = price;
    }
    public Seat(String seatNumber,  Boolean reserved) {
        this.seatNumber = seatNumber;
        this.reserved = reserved;
        double defaultPrice=10+ ('J'-seatNumber.charAt(0))*0.5;

        this.price = new BigDecimal(defaultPrice);
    }
    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.reserved = false;
        double defaultPrice=10+ ('J'-seatNumber.charAt(0))*0.5;

        this.price = new BigDecimal(defaultPrice);
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
