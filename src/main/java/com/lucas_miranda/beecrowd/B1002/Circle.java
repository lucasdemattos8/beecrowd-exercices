package com.lucas_miranda.beecrowd.B1002;

public class Circle {

    private final double piValue = 3.14159;
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return piValue * Math.pow(radius, 2);
    }

}
