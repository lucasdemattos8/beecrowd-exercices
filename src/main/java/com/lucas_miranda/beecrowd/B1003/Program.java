package com.lucas_miranda.beecrowd.B1003;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        calculator.setFirstValue(sc.nextInt());
        calculator.setSecondValue(sc.nextInt());

        sc.close();

        int totalSum = calculator.getSum();

        System.out.println("SOMA = " + totalSum);        

    }
}
