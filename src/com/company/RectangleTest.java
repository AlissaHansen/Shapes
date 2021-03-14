package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

   @Test
    public void testArea()
    {
        Rectangle rectangle = new Rectangle(new double[]{2, 2}, 5, 12);
        double result = rectangle.findArea();
        assertEquals(60, result);

    }
    @Test
    public void testCenter()
    {
        Rectangle rectangle = new Rectangle(new double[]{2, 2}, 5, 12);
        double[] result = rectangle.findCenter();
        double[] expectedresult = {8.0, 4.5};
        assertArrayEquals(expectedresult, result);
    }
    @Test
    public  void testCircumference()
    {
        Rectangle rectangle = new Rectangle(new double[]{2, 2}, 5, 12);
        double result = rectangle.findCircumference();
        assertEquals(34, result);
    }
    @Test
    public void testisPointinside()
    {
        Rectangle rectangle = new Rectangle(new double[]{2, 2}, 5, 12);
        String result = rectangle.isPointinside(3, 3);
        assertEquals("Punktet er i rektanglen!", result);
    }
    }