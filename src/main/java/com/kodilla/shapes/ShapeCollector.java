package com.kodilla.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes=new ArrayList<>();

    public int getAmount(){
        return shapes.size();
    }

    public void addShape (Shape shape){
     shapes.add(shape);
     }

    public Shape getShape (int index){
       return shapes.get(index);
       }

    public void removeShape (int index){
    shapes.remove(index);
    }

    public void showShapes () {
        for (Shape s:shapes) {
       System.out.println("shape " + s.getName());
        }
    }
}
