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

        System.out.println(euclideanDistance(new double[] {2,2,}, new double[] {4,5}, new double[] {6,3}));
    }

    public static String euclideanDistance(double [] triCenter, double[] circleCenter, double [] rectCenter){
        double triToCircle;
        double triToRect;
        double circletoRect;

        triToCircle = Math.sqrt((Math.pow(circleCenter[0] - triCenter[0],2) + Math.pow(circleCenter[1] - triCenter[1],2)));
        triToRect = Math.sqrt((Math.pow(rectCenter[0] - triCenter[0],2) + Math.pow(rectCenter[1] - triCenter[1],2)));
        circletoRect = Math.sqrt((Math.pow(rectCenter[0] - circleCenter[0],2) + Math.pow(rectCenter[1] - circleCenter[1],2)));

        String distanceTriCircle = "Afstanden fra trkanten til cirklen er: " + triToCircle;
        String distanceTriRect = "Afstanden fra trkanten til rektangel er: " + triToRect;
        String distanceCircleRect = "Afstanden fra cirklen til rektangelen er: " + circletoRect;

        return distanceTriCircle + "\n" + distanceTriRect + "\n" + distanceCircleRect;


    }
}
