package com.github.hcsp.polymorphism;

public class Circle extends Shape {
    // 圆的直径
    // 提示，圆周率可以使用Math.PI
    private double diameter;
    private double radius;

    public Circle(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
