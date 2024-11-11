package com.lucas_miranda.beecrowd.B1005;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class B1005UnitTest {

    @ParameterizedTest(name = "Test {index} - First Grade: {0}, Second Grade: {1} | Expected Average: {2}")
    @DisplayName("Should calculate the correct average for given grades")
    @CsvSource({
        "5.0, 7.1, 6.43182",
        "0.0, 7.1, 4.84091",
        "10.0, 10.0, 10.00000"
    })
    public void shouldCalculateAverageCorrectly(double firstGrade, double secondGrade, double expectedAverage) {
        Student student = new Student();
        student.setFirstGrade(firstGrade);
        student.setSecondGrade(secondGrade);

        double actualAverage = student.getAverage();
        assertEquals(expectedAverage, actualAverage, 0.00001, "The calculated average should match the expected value.");
    }
}
