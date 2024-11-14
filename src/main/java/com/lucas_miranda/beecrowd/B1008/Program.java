package com.lucas_miranda.beecrowd.B1008;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        employee.setID(sc.nextInt());
        employee.setHoursWorked(sc.nextInt());
        employee.setValuePerHour(sc.nextDouble());

        sc.close();
         
        double salary = employee.getSalary();
        
        String formattedSalary = String.format("%.2f", salary);
        
        System.out.println("NUMBER = " + employee.getID());
        System.out.println("SALARY = U$ " + formattedSalary);

    }
}
