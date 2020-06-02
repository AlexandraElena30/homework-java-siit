package com.siit.homeworks.homework07_TestOOP;

public class Square extends Shapes {

    private double side;

    public Square(double s){
        this.side=s;
    }
    @Override
    public double surface() {
        double A = 0;
        A = Math.pow(this.side,2);
        return A;
    }

    @Override
    public double perimeter() {
        double P = 0;
        P = this.side * 4;
        return P;
    }

    public double getSide() {
        return side;
    }
}
