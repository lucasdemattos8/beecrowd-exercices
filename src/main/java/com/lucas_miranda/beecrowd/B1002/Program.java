package com.lucas_miranda.beecrowd.B1002;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
         
        circle.setRadius(sc.nextDouble());

        sc.close();

        double area = circle.getArea();
        
        String formattedArea = String.format("%.4f", area);
        
        
        System.out.println("A=" + formattedArea);

    }
}
