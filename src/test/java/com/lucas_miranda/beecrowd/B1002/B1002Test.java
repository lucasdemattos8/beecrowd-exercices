package com.lucas_miranda.beecrowd.B1002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class B1002Test {

    @Test
    @DisplayName("Test 1 - Assert the Radius is equals 12.5664")
    public void shouldPrintRadiusEquals12(){

        String input = "2.00\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expected = "A=12.5664\n";

        assertEquals(expected, outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n"));
    }

    @Test
    @DisplayName("Test 2 - Assert the Radius is equals 31819.3103")
    public void shouldPrintRadiusEquals31819(){

        String input = "100.64\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expected = "A=31819.3103\n";

        assertEquals(expected, outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n"));
    }

    @Test
    @DisplayName("Test 3 - Assert the Radius is equals 70685.7750")
    public void shouldPrintRadiusEquals70685(){

        String input = "150.00\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expected = "A=70685.7750\n";

        assertEquals(expected, outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n"));
    }
    
}
