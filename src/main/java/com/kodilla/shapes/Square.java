package com.kodilla.shapes;

public class Square implements Shape{

    private int a;

    public Square(int a){
        this.a=a;

    }
    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getField() {
        return a*a;
    }
}
