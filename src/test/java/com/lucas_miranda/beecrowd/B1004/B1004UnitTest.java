package com.lucas_miranda.beecrowd.B1004;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class B1004UnitTest {

    @Test
    @DisplayName("Product of A= 0 and B= 0 should be 0")
    public void shouldMultiplyTwoNeutralNumbers() {
        Calculator cal = new Calculator();
        
        cal.setFirstValue(0);
        cal.setSecondValue(0);

        double expectedSum = 0;
        double actualSum = cal.getProduct();

        assertEquals(expectedSum, actualSum, 0.0001);
    }

    @Test
    @DisplayName("Product of A= -1 and B= -1 should be 1")
    public void shouldMultiplyTwoNegativeNumbers() {
        Calculator cal = new Calculator();
        
        cal.setFirstValue(-1);
        cal.setSecondValue(-1);

        double expectedSum = 1;
        double actualSum = cal.getProduct();

        assertEquals(expectedSum, actualSum, 0.0001);
    }

    @Test
    @DisplayName("Product of A= 1 and B= -1 should be -1")
    public void shouldMultiplyOnePositivyAndOneNegativeNumbers() {
        Calculator cal = new Calculator();
        
        cal.setFirstValue(1);
        cal.setSecondValue(-1);

        double expectedSum = -1;
        double actualSum = cal.getProduct();

        assertEquals(expectedSum, actualSum, 0.0001);
    }

    @Test
    @DisplayName("Product of A= 1 and B= 1 should be 1")
    public void shouldMultiplyTwoPositiveNumbers() {
        Calculator cal = new Calculator();
        
        cal.setFirstValue(1);
        cal.setSecondValue(1);

        double expectedSum = 1;
        double actualSum = cal.getProduct();

        assertEquals(expectedSum, actualSum, 0.0001);
    }
    
}
