package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task1HWTest {
    private Task1 test;// класс с кодом из 1 задачки д\з

    @BeforeEach
    void generateTestObject() {
        test = new Task1();
    }

    @Test
    void evenOddNumberTestIntTrue() {
        assertTrue(test.evenOddNumber(4));
    }

    @Test
    void evenOddNumberTestIntFalse() {
        assertFalse(test.evenOddNumber(5));
    }
}
