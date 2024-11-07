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

        double expecteSum = 25;
        double actualArea = cal.getSum();

        assertEquals(expecteSum, actualArea, 0.0001);
    }

    @Test
    @DisplayName("Sum of A=0 and B=0 should be 0")
    public void shouldSumTwoNeutralNumbers() {
        Calculator cal = new Calculator();
        
        cal.setFirstValue(0);
        cal.setSecondValue(0);

        double expectedArea = 0;
        double actualArea = cal.getSum();

        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
}
