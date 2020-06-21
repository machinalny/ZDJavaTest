package com.sda.zdTestSda;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LifeCycleJUnitTest {

    @BeforeAll
    static void setUpAll(){System.out.println("Przygotuj do wszystkich testow");}

    @AfterAll
    static void tearDownAll(){System.out.println("Posprzataj po wszystkich testach");}

    @BeforeEach
    public void setUp(){System.out.println("Przygotuj do testu");}

    @AfterEach
    public void tearDown(){System.out.println("Posprzataj po tescie");}

    @Test
    public void testValid() {
        System.out.println("Test Prawidlowy");
        String[] arrayToTest = {"A", "B", "C"};
        assertArrayEquals(arrayToTest, new String[]{"A", "B", "C"});
        assertEquals(1, 1);
    }

    @Test
    public void testInvalid() {
        System.out.println("Test niepoprawny");
        assertEquals(1, 0);
    }
}
