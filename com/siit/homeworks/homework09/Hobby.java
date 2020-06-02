package com.siit.homeworks.homework09;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String hobbyName;
    private int frequency;
    private List<Address> addressList;

    public Hobby(String hobbyName, int frequency, ArrayList<Address> addressList) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.addressList = addressList;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }
}
