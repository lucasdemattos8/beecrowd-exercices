package com.lucas_miranda.beecrowd.B1003;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class B1003FunctionalTest {

    @Test
    @DisplayName("Test 1 - Should print 'SOMA = 40'")
    public void shouldPrintTheSumBetweenX30AndY10(){

        String input = "30\n10\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expected = "SOMA = 40\n";
        String current = outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n");

        assertEquals(expected, current);
    }

    @Test
    @DisplayName("Test 2 - Should print 'SOMA = -20'")
    public void shouldPrintTheSumBetweenXMenus30AndY10(){

        String input = "-30\n10\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expected = "SOMA = -20\n";
        String current = outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n");

        assertEquals(expected, current);
    }

    @Test
    @DisplayName("Test 3 - Should print 'SOMA = 0'")
    public void shouldPrintTheSumBetweenX0AndY0(){

        String input = "0\n0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expected = "SOMA = 0\n";
        String current = outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n");

        assertEquals(expected, current);
    }
    
}
