package com.lucas_miranda.beecrowd.B1000;

public class Program {
    public static void main(String[] args) {

        GreeterService greeter;

        greeter = new GreeterService();

        System.out.println(greeter.getGreeting());
        
    }
}
