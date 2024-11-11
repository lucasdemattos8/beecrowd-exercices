package com.lucas_miranda.beecrowd.B1006;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.setFirstGrade(sc.nextDouble());
        student.setSecondGrade(sc.nextDouble());
        student.setThirdGrade(sc.nextDouble());
        
        sc.close();
        
        double average = student.getAverage();
        
        String formattedAverage = String.format("%.1f", average);
        
        System.out.println("MEDIA = " + formattedAverage);

    }
}
