package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    public void testArea()
    {
        Triangle triangle = new Triangle(new double[]{1, 1}, new double[]{7, 1}, new double[]{4, 8});
        double result = triangle.findArea();
        assertEquals(21.0, result);

    }
    @Test
    public void testCenter()
    {
        Triangle triangle = new Triangle(new double[]{1, 1}, new double[]{7, 1}, new double[]{4, 8});
        double[] result = triangle.findCenter();
        double[] expectedresult = {4.0, 3.3333333333333335};
        assertArrayEquals(expectedresult, result);
    }
    @Test
    public  void testCircumference()
    {
        Triangle triangle = new Triangle(new double[]{1, 1}, new double[]{7, 1}, new double[]{4, 8});
        double result = triangle.findCircumference();
        assertEquals(21.231546211727817, result);
    }
    @Test
    public void testisPointinside()
    {
        Triangle triangle = new Triangle(new double[]{1, 1}, new double[]{7, 1}, new double[]{4, 8});
        String result = triangle.isPointinside(6, 1);
        assertEquals("Punktet er ikke i trekanten!", result);
    }
}