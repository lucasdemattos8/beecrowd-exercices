package com.lucas_miranda.beecrowd.B1004;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class B1004FunctionalTest {

    @Test
    @DisplayName("Test 1 - Should print 'PROD = 27'")
    public void shouldPrintTheProductBetweenX3AndY9(){

        String input = "3\n9\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expected = "PROD = 27\n";
        String current = outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n");

        assertEquals(expected, current);
    }

    @Test
    @DisplayName("Test 2 - Should print 'PROD = -300'")
    public void shouldPrintTheProductBetweenXMenus30AndY10(){

        String input = "-30\n10\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expected = "PROD = -300\n";
        String current = outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n");

        assertEquals(expected, current);
    }

    @Test
    @DisplayName("Test 3 - Should print 'PROD = 0'")
    public void shouldPrintTheProductBetweenX0AndY9(){

        String input = "0\n9\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Program.main(new String[]{});

        System.setOut(System.out);

        String expected = "PROD = 0\n";
        String current = outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n");

        assertEquals(expected, current);
    }
    
}
