package com.lucas_miranda.beecrowd.B1008;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class B1008FunctionalTest {

    @ParameterizedTest(name = "Test {index} - Input: {0} | Expected: {1}")
    @DisplayName("Should print the correct ID and Salary for given input values")
    @CsvSource({
        "'25\n100\n5.50\n', 'NUMBER = 25\nSALARY = U$ 550.00\n'",
        "'1\n200\n20.50\n', 'NUMBER = 1\nSALARY = U$ 4100.00\n'",
        "'6\n145\n15.55\n', 'NUMBER = 6\nSALARY = U$ 2254.75\n'"
    })
    public void shouldPrintTheCorrectEmployeeSalaryWithDifferentValues(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String current = outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n");
        assertEquals(expected, current);
    }   
}
