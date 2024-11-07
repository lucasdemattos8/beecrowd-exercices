package com.lucas_miranda.beecrowd.B1000;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class B1000Test {

    @Test
    @DisplayName("Testar se a saída corresponde ao valor 'Hello World'")
    public void shouldPrintHelloWorldToConsole() {
        // Redireciona o System.out para capturar a saída
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        
        // Redireciona o System.out
        System.setOut(printStream);
        
        // Chama o método main ou o método que gera a saída
        Program.main(new String[]{});
        
        // Restaura o System.out
        System.setOut(System.out);
        
        // Verifica a saída (sem considerar espaços em branco ou quebras de linha)
        assertEquals("Hello, World!\n", outputStream.toString().replaceAll("\\r\\n|\\r|\\n", "\n"));
    }


    // outros testes
}

