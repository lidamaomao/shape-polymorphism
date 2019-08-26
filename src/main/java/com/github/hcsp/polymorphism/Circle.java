package com.github.hcsp.polymorphism;

import static java.lang.Math.*;

public class Circle extends Shape{
    // 圆的直径
    // 提示，圆周率可以使用Math.PI
    private double diameter;


    public Circle(double diameter) {
        this.diameter = diameter;
    }
    @Override
    public double getArea() {
        double radius = diameter/2;
        return  PI*(radius*radius);
    }
}
