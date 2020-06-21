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
}
