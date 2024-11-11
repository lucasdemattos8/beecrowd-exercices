package com.lucas_miranda.beecrowd.B1005;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        
        student.setFirstGrade(sc.nextDouble());
        student.setSecondGrade(sc.nextDouble());
        
        sc.close();
        
        Double average = student.getAverage();
        String formattedAverage = String.format("%.5f", average);
        
        System.out.println("MEDIA = " + formattedAverage);


    }
}
