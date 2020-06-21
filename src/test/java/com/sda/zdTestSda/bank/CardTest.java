package com.sda.zdTestSda.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void getNumber() {
        Card card = new Card("Lukasz", 1000L, 12000L);
        assertEquals(12000L, card.getNumber());
    }

    @Test
    void getOwnerName() {
    }

    @Test
    void getAccountNumber() {
    }

    @Test
    void changePin() {
    }

    @Test
    void checkPin() {
    }
}