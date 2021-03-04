package com.company;

public class Circle extends Shape{

    public Circle (double xc, double yc, double rad) {

        this.xc = xc;
        this.yc = yc;
        this.rad = rad;

    }
    public double findArea(){
        return(Math.PI * Math.pow(rad,2));
    }
}
