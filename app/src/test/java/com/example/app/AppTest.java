package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void getGreeting() {
        App app = new App();
        assertEquals("Hello World!", app.getGreeting());
    }
}