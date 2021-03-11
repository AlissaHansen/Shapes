package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle triangleA = new Triangle(new double[]{1,1}, new double[]{3,7}, new double[] {2,5});
        double [] test = triangleA.findSideLengths();
        System.out.println(test[2]);

        Circle circleA = new Circle(new int[]{3, 4}, 6);
        System.out.println(circleA.findArea());

        Rectangle rectangleA = new Rectangle(40,60);
        System.out.println(rectangleA.findArea());
    }


}
