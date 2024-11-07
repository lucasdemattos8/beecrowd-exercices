package com.lucas_miranda.beecrowd.B1003;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class B1003UnitTest {

    @Test
    @DisplayName("Sum of A=10 and B=15 should be 25")
    public void shouldSumTwoPositiveNumbers() {
        Calculator cal = new Calculator();
        
        cal.setFirstValue(10);
        cal.setSecondValue(15);

        double expectedSum = 25;
        double actualSum = cal.getSum();

        assertEquals(expectedSum, actualSum, 0.0001);
    }

    @Test
    @DisplayName("Sum of A=0 and B=0 should be 0")
    public void shouldSumTwoNeutralNumbers() {
        Calculator cal = new Calculator();
        
        cal.setFirstValue(0);
        cal.setSecondValue(0);

        double expectedSum = 0;
        double actualSum = cal.getSum();

        assertEquals(expectedSum, actualSum, 0.0001);
    }

    @Test
    @DisplayName("Sum of A= -10 and B= -5 should be -15")
    public void shouldSumTwoNegativeNumbers() {
        Calculator cal = new Calculator();
        
        cal.setFirstValue(-10);
        cal.setSecondValue(-5);

        double expectedSum = -15;
        double actualSum = cal.getSum();

        assertEquals(expectedSum, actualSum, 0.0001);
    }
    
}
