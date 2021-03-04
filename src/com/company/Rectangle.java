package com.company;

public class Rectangle extends Shape {

    public Rectangle(double rectHeight, double width) {

        this.rectHeight = rectHeight;
        this.width = width;
    }

    public double findArea() {
        return (rectHeight*width);
    }
}
