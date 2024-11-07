package com.lucas_miranda.beecrowd.B1002;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        cal.setFirstValue(sc.nextInt());
        cal.setSecondValue(sc.nextInt());
        
        sc.close();
        
        System.out.println("X = " + cal.getSum());
        
    }
}
