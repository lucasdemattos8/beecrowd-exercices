package com.lucas_miranda.beecrowd.B1005;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class B1005FunctionalTest {

    @ParameterizedTest(name = "Test {index} - Input: {0} | Expected: {1}")
    @DisplayName("Should print the correct average for given input values")
    @CsvSource({
        "'5.0\n7.1\n', 'MEDIA = 6.43182\n'",
        "'0.0\n7.1\n', 'MEDIA = 4.84091\n'",
    })
    public void shouldPrintTheAverageWithDifferentValues(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String current = outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n");
        assertEquals(expected, current);
    }
}
