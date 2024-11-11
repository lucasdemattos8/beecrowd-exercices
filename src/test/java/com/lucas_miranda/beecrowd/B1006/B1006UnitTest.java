package com.lucas_miranda.beecrowd.B1006;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class B1006UnitTest {

    @ParameterizedTest(name = "Test {index} - First Grade: {0}, Second Grade: {1}, Third Grade: {2} | Expected Average: {3}")
    @DisplayName("Should calculate the correct average for given grades")
    @CsvSource({
        "5.0, 6.0, 7.0, 6.3",
        "5.0, 10.0, 10.0, 9.0",
        "10.0, 10.0, 5.0, 7.5"
    })
    public void shouldCalculateAverageCorrectly(double firstGrade, double secondGrade, double thirdGrade, double expectedAverage) {
        Student student = new Student();
        
        student.setFirstGrade(firstGrade);
        student.setSecondGrade(secondGrade);
        student.setThirdGrade(thirdGrade);

        double actualAverage = student.getAverage();
        assertEquals(expectedAverage, actualAverage, 0.00001, "The calculated average should match the expected value.");
    }
}
