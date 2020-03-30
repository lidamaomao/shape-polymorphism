package com.github.hcsp.polymorphism;

import static java.lang.Math.PI;

public class Circle extends Shape{
    public double getDiameter() {
        return diameter;
    }

    // 圆的直径
    // 提示，圆周率可以使用Math.PI
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        return  Math.PI*getDiameter()*getDiameter()/4;
    }
}
