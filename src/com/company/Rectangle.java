package com.company;

public class Rectangle extends Shape {

    public Rectangle(double[] cordRect, double rectHeight, double width) {

        this.rectHeight = rectHeight;
        this.width = width;
        this.cordRect = cordRect;
    }

    @Override
    public double findArea() {
        return (rectHeight*width);
    }

    @Override
    public double[] findCenter() {
        double halfWidth = width/2;
        double halfHeight = rectHeight/2;
        double[] center = {cordRect[0]+halfWidth,cordRect[1]+halfHeight};
        return center;
    }

    @Override
    public double findCircumference() {

        return (rectHeight*2)+(width*2);
    }

    @Override
    public String isPointinside(int x, int y) {
       double[] cordRect2 = {cordRect[0] + width, cordRect[1]};
       double[] cordRect3 = {cordRect2[0], cordRect2[1] + rectHeight};
       double[] cordRect4 = {cordRect[0], cordRect[1] + rectHeight};

       if (x >= cordRect[0] && x <= cordRect2[0] && y >= cordRect[1] && y <= cordRect4[1]) {
           return "Punktet er i rektanglen!";
       } else {
           return "Punktet er ikke i rektangelen!";
       }

    }
}
