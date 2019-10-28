package com.github.hcsp.polymorphism;

/**
 * 圆的直径
 * 圆周率可以使用Math.PI
 * @author wheelchen
 */
public class Circle extends Shape{

    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        return Math.PI * this.diameter/2 * this.diameter/2;
    }
}
