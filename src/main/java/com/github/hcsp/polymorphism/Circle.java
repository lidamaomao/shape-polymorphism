package com.github.hcsp.polymorphism;

public class Circle extends Shape {
    // 圆的直径
    // 提示，圆周率可以使用Math.PI
    private final double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }
    public double getArea() {
        return (diameter / 2) * (diameter / 2) * Math.PI;
    }
}
