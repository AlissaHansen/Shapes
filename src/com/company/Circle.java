package com.company;

public class Circle extends Shape{

    public Circle (double [] cordCircle, double rad) {

        this.cordCircle = cordCircle;
        this.rad = rad;

    }

    @Override
    public double findArea() {
        return(Math.PI * Math.pow(rad,2));
    }

    @Override
    public double[] findCenter() {
        return cordCircle;
    }

    @Override
    public double findCircumference() {
        return 2*Math.PI*rad;
    }

    @Override
    public String isPointinside(int x, int y) {

        double dist = Math.sqrt(Math.pow(cordCircle[0]-x,2) + (Math.pow(cordCircle[1]-y,2)));
        if (dist > rad) {
            return "Punktet er ikke i cirklen!";
        }else {
            return "Punktet er i cirklen!";
        }
    }

}
