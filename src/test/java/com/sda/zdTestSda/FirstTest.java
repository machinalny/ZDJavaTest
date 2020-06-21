package com.sda.zdTestSda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    private final String myName = "Heisenberg";

    @Test
    public void sayMyNameTestValid() {
        String yourNameIs = "Heisenberg";
        assertEquals(myName, yourNameIs);
    }

    @Test
    public void sayMyNameTestInvalid() {
        String yourNameIs = "Molotov";
        assertEquals(myName, yourNameIs);
    }

    @Test
    public void sayWhatYourNameIs(){
        Integer number = 1;
        assertEquals(number, 2);
    }

    @Test
    public void myTest(){
        String[] stringArray = {"A", "B"};
        assertArrayEquals(stringArray, new String[]{"B", "A"});
    }
}
