package com.lucas_miranda.beecrowd.B1007;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class B1007FunctionalTest {

    @ParameterizedTest(name = "Test {index} - Input: {0} | Expected: {1}")
    @DisplayName("Should print the correct difference for given input values")
    @CsvSource({
        "'5\n6\n7\n8\n', 'DIFERENCA = -26\n'",
        "'0\n0\n7\n8\n', 'DIFERENCA = -56\n'",
        "'5\n6\n-7\n8\n', 'DIFERENCA = 86\n'"
    })
    public void shouldPrintTheDifferenceWithDifferentValues(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String current = outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n");
        assertEquals(expected, current);
    }
}
