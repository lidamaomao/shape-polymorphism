package com.github.hcsp.polymorphism;

public class Rectangle extends Shape {
    // 长方形的长
    private double a;
    // 长方形的宽
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
