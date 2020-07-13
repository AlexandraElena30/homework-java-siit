package com.siit.homeworks.homework15.cars.domain;

import com.sun.org.apache.xerces.internal.util.Status;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Order {

    private int orderNumber;
    private String comments;
    private int customerNumber;
    private LocalDate orderDate;
    private LocalDate requiredDate;
    private LocalDate shippedDate;
    private String status;

    public Order(int orderNumber, String comments, int customerNumber, LocalDate orderDate, LocalDate requiredDate, LocalDate shippedDate, String status) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.status = status;
        this.comments = comments;
        this.customerNumber = customerNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getComments() {
        return comments;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public LocalDate getShippedDate() {
        return shippedDate;
    }

    public String getStatus() {
        return status;
    }
}
