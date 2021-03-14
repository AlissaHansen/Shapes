package com.company;

public class Triangle extends Shape {

    double perimeter = 0;
    public Triangle(double[] cordTri1, double[] cordTri2, double[] cordTri3) {

       this.cordTri1 = cordTri1;
       this.cordTri2 = cordTri2;
       this.cordTri3 = cordTri3;

    }

    public double[] findSideLengths (){

        //Afstanden mellem punkterne findes for at finde sidelængderne af trekanterne
        double sideLen1 = Math.sqrt(Math.pow(cordTri2[0]-cordTri1[0],2) + Math.pow(cordTri2[1]-cordTri1[1],2));
        double sideLen2 = Math.sqrt(Math.pow(cordTri3[0]-cordTri1[0],2) + Math.pow(cordTri3[1]-cordTri1[1],2));
        double sideLen3 = Math.sqrt(Math.pow(cordTri3[0]-cordTri2[0],2) + Math.pow(cordTri3[1]-cordTri2[1],2));
        double[] triSideLengths = {sideLen1, sideLen2, sideLen3};
        return triSideLengths;


    }

    @Override
    public double findArea() {

        double area = (cordTri1[0]*(cordTri2[1]-cordTri3[1])+ cordTri2[0]*
                (cordTri3[1]-cordTri1[1])+cordTri3[0]*(cordTri1[1]-cordTri2[1]))/2;

        return area;
    }

    @Override
    public double[] findCenter() {

        double centrumX = (cordTri1[0]+cordTri2[0]+cordTri3[0])/3;
        double centrumY = (cordTri1[1]+cordTri2[1]+cordTri3[1])/3;
        double[] centrum = {centrumX, centrumY};
        return centrum;
    }

    @Override
    public double findCircumference() {
        double omkreds = findSideLengths()[0] + findSideLengths()[1] + findSideLengths()[2];
        return omkreds;
    }

    @Override
    public String isPointinside(int x, int y) {

    double areaA = findArea();

    double areaB = (x * (cordTri2[1] - cordTri3[1]) + cordTri2[0] *
            (cordTri3[1] - y) + cordTri3[0] * (y - cordTri2[1]))/2;

    double areaC = (x * (cordTri1[1] - cordTri3[1]) + cordTri1[0] *
            (cordTri3[1] - y) + cordTri3[0] * (y - cordTri1[1]))/2;

    double areaD = (x * (cordTri1[1] - cordTri2[1]) + cordTri1[0] *
            (cordTri2[1] - y) + cordTri2[0] * (y - cordTri1[1]))/2;

    if (areaA == areaB + areaC + areaD){
        return "Punktet er i trekanten!";
    } else {
        return "Punktet er ikke i trekanten!";
    }

    }

}