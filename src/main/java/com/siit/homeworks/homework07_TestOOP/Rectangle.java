package com.siit.homeworks.homework07_TestOOP;

public class Rectangle extends Shapes{

    private double width;
    private double length;

    public Rectangle(double l,double w){
        this.length=l;
        this.width=w;
    }
    @Override
    public double surface() {
        double A = 0;
        A=this.width*this.length;
        return A;
    }

    @Override
    public double perimeter() {
        double P = 0;
        P = 2*(this.length + this.width);
        return P;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
