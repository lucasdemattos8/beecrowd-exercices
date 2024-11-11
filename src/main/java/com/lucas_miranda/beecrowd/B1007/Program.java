package com.lucas_miranda.beecrowd.B1007;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        cal.setFirstValue(sc.nextInt());
        cal.setSecondValue(sc.nextInt());
        cal.setThirdValue(sc.nextInt());
        cal.setFourthValue(sc.nextInt());
        
        sc.close();

        int difference = cal.getDifference();
                
        System.out.println("DIFERENCA = " + difference);
        
    }
}
