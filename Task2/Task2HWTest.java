package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task2HWTest {
    private Task2 test;// класс с кодом из 2 задачки д\з

    @BeforeEach
    void generateTestObject() {
        test = new Task2();
    }

    @Test
    void evenOddNumberTestIntTrue() {
        assertTrue(test.numberInInterval(50));
    }

    @Test
    void evenOddNumberTestIntFalse() {
        assertFalse(test.numberInInterval(1));
    }
}
