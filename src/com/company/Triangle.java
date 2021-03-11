package com.company;

public class Triangle extends Shape {

    public Triangle(double[] cordTri1, double[] cordTri2, double[] cordTri3) {

       this.cordTri1 = cordTri1;
       this.cordTri2 = cordTri2;
       this.cordTri3 = cordTri3;

    }
    public double[] findSideLengths (){

        double sideLen1 = Math.sqrt(Math.pow(cordTri2[0]-cordTri1[0],2) + Math.pow(cordTri2[1]-cordTri1[1],2));

        double sideLen2 = Math.sqrt(Math.pow(cordTri3[0]-cordTri1[0],2) + Math.pow(cordTri3[1]-cordTri1[1],2));

        double sideLen3 = Math.sqrt(Math.pow(cordTri3[0]-cordTri2[0],2) + Math.pow(cordTri3[1]-cordTri2[1],2));

        double[] triSideLengths = {sideLen1, sideLen2, sideLen3};

        return triSideLengths;

    }
}