package homework10.vote;


import java.util.Arrays;
import java.util.List;

public class IdentityCard {

    private String lastName, firstName;
    private String address;
    private String CNP;
    private String serial;
    private int number;
    private boolean voted;

    public IdentityCard(String lastName, String firstName, String address, String CNP, String serial, int number) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.CNP = CNP;
        this.serial = serial;
        this.number = number;
        this.voted = false;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
