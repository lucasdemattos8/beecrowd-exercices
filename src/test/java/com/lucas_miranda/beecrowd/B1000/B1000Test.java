package com.lucas_miranda.beecrowd.B1000;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class B1000Test {

    @Test
    @DisplayName("Should test if the Output corresponds 'Hello World'")
    public void shouldPrintHelloWorldToConsole() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        
        System.setOut(printStream);
        
        Program.main(new String[]{});
        
        System.setOut(System.out);
        
        assertEquals("Hello, World!\n", outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n"));
    }


}

