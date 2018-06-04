package com.kodilla.shapes;

public class Triangle implements Shape{

    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a=a;
        this.h=h;
    }

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return 0.5*a*h;
    }
}
