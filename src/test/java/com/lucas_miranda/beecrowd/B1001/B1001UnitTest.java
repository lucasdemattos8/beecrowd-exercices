package com.lucas_miranda.beecrowd.B1001;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class B1001UnitTest {

    @Test
    @DisplayName("Sum of A=1 and B=1 should be 2")
    public void shouldSumTwoPositiveNumbers(){

        Calculator cal = new Calculator();

        cal.setFirstValue(1);
        cal.setSecondValue(1);

        int totalSum = cal.getSum();
        int expected = 2;
        
        assertEquals(expected, totalSum);
    }

    @Test
    @DisplayName("Sum of A=0 and B=0 should be 0")
    public void shouldSumTwoZeroNumbers() {

        Calculator cal = new Calculator();

        cal.setFirstValue(1);
        cal.setSecondValue(1);

        int totalSum = cal.getSum();
        int expected = 2;
        
        assertEquals(expected, totalSum);
    }

    @Test
    @DisplayName("Sum of A=-1 and B=-1 should be 2")
    public void shouldCorrectlySumNegativeNumbers() {

        Calculator cal = new Calculator();

        cal.setFirstValue(-1);
        cal.setSecondValue(-1);

        int totalSum = cal.getSum();
        int expected = -2;
        
        assertEquals(expected, totalSum);
    }
    
}
