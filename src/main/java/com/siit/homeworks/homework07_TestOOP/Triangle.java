package com.siit.homeworks.homework07_TestOOP;

public class Triangle extends Shapes {

    private double b; //base
    private double a; //side
    private double c; //side

    public Triangle(double b, double a, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double surface() {
        double A = 0;
        //sp = semi perimeter
        double sp = (this.a + this.b + this.c) / 2;
        A = Math.sqrt(sp *(sp - this.a)*(sp - this.b)*(sp - this.c));
        return A;
    }

    @Override
    public double perimeter() {
        double P = 0;
        P = this.a + this.b + this.c;
        return P;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public double getC() {
        return c;
    }
}
