package com.lucas_miranda.beecrowd.B1000;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class B1000UnitTest {

    @Test
    @DisplayName("Should return 'Hello World'")
    public void shouldReturnHelloWorld() {

        GreeterService greet = new GreeterService();

        String greeting = greet.getGreeting();
        
        assertEquals("Hello, World!", greeting);
    }
    
}
