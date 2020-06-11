package com.siit.homeworks.homework07_TestOOP;

public class Circle extends Shapes {

    private double radius;
    private final double PI = Math.PI;

    public Circle(double radius){
        this.radius=radius;

    }


    @Override
    public double surface() {
        double A = 0;
        A = this.PI * Math.pow(this.radius,2);
        return A;
    }

    @Override
    public double perimeter() {
        double P = 0;
        P = 2* this.radius * this.PI;
        return P;
    }

    public double getRadius() {
        return radius;
    }
}
