package com.lucas_miranda.beecrowd.B1007;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class B1007UnitTest {

    @ParameterizedTest(name = "Test {index} - A: {0}, B: {1}, C: {2}, D: {3} | Expected difference: {4}")
    @DisplayName("Should calculate the correct difference for given values")
    @CsvSource({
        "5, 6, 7, 8, -26",
        "0, 0, 7, 8, -56",
        "5, 6, -7, 8, 86"
    })
    public void shouldCalculateDifferenceCorrectly(int a, int b, int c, int d, int expectedDifference) {
        Calculator cal = new Calculator();
        
        cal.setFirstValue(a);
        cal.setSecondValue(b);
        cal.setThirdValue(c);
        cal.setFourthValue(d);

        double actualDifference = cal.getDifference();
        assertEquals(expectedDifference, actualDifference, 0.00001, "The calculated average should match the expected value.");
    }

}
