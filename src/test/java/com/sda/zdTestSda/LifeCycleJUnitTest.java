package com.sda.zdTestSda;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LifeCycleJUnitTest {
    private static Integer numberOne = 15;
    private Integer numberTwo = 4;

    @BeforeAll
    static void setUpAll() {
        numberOne = 1;
        System.out.println("Przygotuj do wszystkich testow");
    }

    @AfterAll
    static void tearDownAll() {
        numberOne = 0;
        System.out.println("Posprzataj po wszystkich testach");
    }

    @BeforeEach
    public void setUp() {
        numberTwo = 2;
        System.out.println("Przygotuj do testu");
    }

    @AfterEach
    public void tearDown() {
        numberTwo = 0;
        System.out.println("Posprzataj po tescie");
    }

    @Test
    @DisplayName("Test numer 1")
    public void testValid() {
        System.out.println("Test Prawidlowy");
        String[] arrayToTest = {"A", "B", "C"};
        assertArrayEquals(arrayToTest, new String[]{"A", "B", "C"});
        assertEquals(numberTwo, numberOne);
    }

    @Test
    public void testInvalid() {
        System.out.println("Test niepoprawny");
        assertEquals(1, 0);
    }
}
