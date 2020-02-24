package com.github.hcsp.polymorphism;

public class Circle extends Shape {
    // 圆的直径
    // 提示，圆周率可以使用Math.PI
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    // 返回当前"形状"(Shape)的面积
    public double getArea() {
        return Math.PI * diameter * diameter / 4;
    }
}
