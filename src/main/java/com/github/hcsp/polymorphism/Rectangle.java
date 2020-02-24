package com.github.hcsp.polymorphism;

public class Rectangle extends Shape {
    // 长方形的长
    private double a;
    // 长方形的宽
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    // 返回当前"形状"(Shape)的面积
    public double getArea() {
        return a * b;
    }
}
