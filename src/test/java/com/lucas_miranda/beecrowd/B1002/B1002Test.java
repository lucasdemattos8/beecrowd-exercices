package com.lucas_miranda.beecrowd.B1002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class B1002Test {

    @Test
    @DisplayName("Should print 'X = 19' when input is 9 and 10")
    public void shouldPrintX19WhenInputIs10And9() {
        
        String input = "10\n9\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expectedOutput = "X = 19\n";
        assertEquals(expectedOutput, outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n"));
    }

    @Test
    @DisplayName("Should print 'X = 25' when input is 5 and 20")
    public void shouldPrintX25WhenInputIs20And5() {

        String input = "20\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expectedOutput = "X = 25\n";
        assertEquals(expectedOutput, outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n"));
    }

    @Test
    @DisplayName("Should print 'X = 70' when input is 10 and 60")
    public void shouldPrintX70WhenInputIs10And60() {

        String input = "10\n60\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expectedOutput = "X = 70\n";
        assertEquals(expectedOutput, outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n"));
    }
}
