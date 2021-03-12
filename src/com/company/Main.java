package com.company;


public class Main {
    public static void main(String[] args) {

        Triangle triangleA = new Triangle(new double[]{1, 1}, new double[]{7, 1}, new double[]{4, 8});
        System.out.println("Arealet af trekant er: " + triangleA.findArea());
        System.out.println("Omkredsen af trekanten er: " + triangleA.findCircumference());
        System.out.println("Trekantens centrum ligger i: (" + triangleA.findCenter()[0] + " , " + triangleA.findCenter()[1] + ")");
        System.out.println(triangleA.isPointinside(6, 1));
        System.out.println("  ");

        Circle circleA = new Circle(new double[]{3, 4}, 6);
        System.out.println("Arealet af cirkel er: " + circleA.findArea());
        System.out.println("Cirklens centrum ligger i: (" + circleA.findCenter()[0] + " , " + circleA.findCenter()[1] + ")");
        System.out.println("Omkredsen af cirklen er: " + circleA.findCircumference());
        System.out.println(circleA.isPointinside(20, 20));
        System.out.println("  ");

        Rectangle rectangleA = new Rectangle(new double[]{2, 2}, 5, 12);
        System.out.println("Arealet af rektangel er: " + rectangleA.findArea());
        System.out.println("Rektangelts centrum ligger i: (" + rectangleA.findCenter()[0] + " , " + rectangleA.findCenter()[1] + ")");
        System.out.println("Omkredsen af rektangel er: " + rectangleA.findCircumference());
        System.out.println(rectangleA.isPointinside(3, 3));
        System.out.println("  ");
    }
}
