package com.github.hcsp.polymorphism;

public class Circle extends Shape {
    // 圆的直径
    // 提示，圆周率可以使用Math.PI
    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Circle(double diameter) {

        this.setDiameter(diameter);
    }

    @Override
    public double getArea() {
        return Math.PI * (getDiameter() / 2) * (getDiameter() / 2);
    }
}
