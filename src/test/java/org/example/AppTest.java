package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testHelloWorld() {
        App app = new App();
        String message = app.getMessage();
        assertEquals("Hello, World!", message);
        System.out.println("Test output: " + message);
    }
}
