package com.github.hcsp.polymorphism;

import static java.lang.Math.PI;

public class Circle extends Shape{
    // 圆的直径
    // 提示，圆周率可以使用Math.PI
    private double diameter;

    @Override
    public double getArea() {
        return (diameter/2)*(diameter/2)*PI;
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }
}
