package com.kodilla.shapes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeCollectorTest {

    @Test
    public void testAddShape (){
        Square square=new Square(2);
        Triangle triangle=new Triangle(2,6);
        ShapeCollector collector=new ShapeCollector();

        collector.addShape(square);
        collector.addShape(triangle);

        Assert.assertEquals(collector.getAmount(),2);
    }

}