package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle triangleA = new Triangle(new double[]{1,1}, new double[]{7,1}, new double[] {4,8});
        System.out.println(triangleA.findArea());

        Circle circleA = new Circle(new int[]{3, 4}, 6);
        System.out.println(circleA.findArea());

        Rectangle rectangleA = new Rectangle(40,60);
        System.out.println(rectangleA.findArea());
    }


}
