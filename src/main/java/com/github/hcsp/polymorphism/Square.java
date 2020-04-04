package com.github.hcsp.polymorphism;

public class Square extends Shape{
//    https://github.com/7952126/polymorphism-overload-method-selection.gitSquare {
    // 正方形的边长
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return Math.pow(sideLength,2);
    }
}
