package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle triangleA = new Triangle(15, 8, 15,8, 17);
        System.out.println(triangleA.findArea());

        Circle circleA = new Circle(5,5,10);
        System.out.println(circleA.findArea());

        Rectangle rectangleA = new Rectangle(40,60);
        System.out.println(rectangleA.findArea());
    }


}
