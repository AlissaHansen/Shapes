package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    public void testArea()
    {
        Circle circle = new Circle(new double[]{3, 4}, 6);
        double result = circle.findArea();
        assertEquals(113.09733552923255, result);

    }
    @Test
    public void testCenter()
    {
        Circle circle = new Circle(new double[]{3, 4}, 6);
        double[] result = circle.findCenter();
        double[] expectedresult = {3, 4};
        assertArrayEquals(expectedresult, result);
    }
    @Test
    public  void testCircumference()
    {
        Circle circle = new Circle(new double[]{3, 4}, 6);
        double result = circle.findCircumference();
        assertEquals(37.69911184307752, result);
    }
    @Test
    public void testisPointinside()
    {
        Circle circle = new Circle(new double[]{3, 4}, 6);
        String result = circle.isPointinside(20, 20);
        assertEquals("Punktet er ikke i cirklen!", result);
    }
}