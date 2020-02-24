package com.github.hcsp.polymorphism;

public class Square extends Shape {
    // 正方形的边长
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    // 返回当前"形状"(Shape)的面积
    public double getArea() {
        return sideLength * sideLength;
    }
}
