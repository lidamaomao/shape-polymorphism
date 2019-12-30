package com.github.hcsp.polymorphism;

public class Square extends Shape {
    // 正方形的边长
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
