package com.company;


public class Shape implements ShapeInterface {
    // Triangle attributes
    double[] cordTri1 = new double[2];
    double[] cordTri2 = new double[2];
    double[] cordTri3 = new double[2];


    // Circle attributes
    double[] cordCircle = new double[2];
    double rad;

    // Rectangle attributes
    double rectHeight;
    double width;
    double[] cordRect = new double[2];


    @Override
    public double findArea(){
        return 0;
    }

    @Override
    public double[] findCenter() {
        return new double[0];
    }

    @Override
    public double findCircumference() {
        return 0;
    }

    @Override
    public String isPointinside(int x, int y) {
       return null;
    }

}

