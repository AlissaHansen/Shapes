package com.company;

public class Circle extends Shape{

    public Circle (int [] cordCircle, double rad) {

        this.cordCircle = cordCircle;
        this.rad = rad;

    }
    public double findArea(){
        return(Math.PI * Math.pow(rad,2));

    }
}
