package com.lucas_miranda.beecrowd.B1008;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class B1008UnitTest {

    @ParameterizedTest(name = "Test {index} - ID: {0}, Hours Worked: {1}, Value Per Hour: {2} | Expected: ID = {3}, Salary = {4}")
    @DisplayName("Should return the correct ID and Salary for given input values")
    @CsvSource({
        "25, 100, 5.50, 25, 550.00",
        "1, 200, 20.50, 1, 4100.00",
        "6, 145, 15.55, 6, 2254.75"
    })
    public void shouldCalculateTotalSalaryCorrectly(Integer id, Integer hoursWorked, Double valuePerHour, Integer expectedID, Double expectedSalary) {
        Employee emp = new Employee();
        
        emp.setID(id);
        emp.setHoursWorked(hoursWorked);
        emp.setValuePerHour(valuePerHour);

        Integer actualID = emp.getID();
        Double actualSalary = emp.getSalary();

        assertEquals(expectedID, actualID, 0.00001, "The Employee ID should be the expected value.");
        assertEquals(expectedSalary, actualSalary, 0.00001, "The Employee Salary should be the expected value.");
    }
    
}
