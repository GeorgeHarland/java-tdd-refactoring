package com.georgeharland.minithing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    HelloWorld testSubject;

    @Test
    public void englishHelloWorld() {
        assertEquals("Hello, World!", testSubject.returnGreeting());
    }

    @Test
    public void spanishHelloWorld() {
        assertEquals("Hello world in Spanish", testSubject.returnGreeting("spanish"));
    }

    @BeforeEach
    public void setup() {
        testSubject = new HelloWorld();
    }
}