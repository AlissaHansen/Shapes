package com.company;

import java.lang.reflect.Array;

public class Shape implements ShapeInterface {
    // Triangle attributes
    double[] cordTri1 = new double[2];
    double[] cordTri2 = new double[2];
    double[] cordTri3 = new double[2];


    // Circle attributes
    int[] cordCircle = new int[2];
    double rad;

    // Rectangle attributes
    double rectHeight;
    double width;


    @Override
    public double findArea(){
        return 0;
    }
    }

