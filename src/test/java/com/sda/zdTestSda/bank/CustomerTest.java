package com.sda.zdTestSda.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Lukasz", "Lopusinskie", "Wroclaw", "XXX");
    }

    @Test
    public void test_createNewCustomerWithPesel(){
        String pesel = "7847144444";
        Customer customer = new Customer("Lukasz", "Lopusinskie", "Wroclaw", pesel);

        String peselResult = customer.getPesel();

        assertEquals(pesel, peselResult);
    }

    @Test
    public void test_getFirstNameFromCustomer(){
        String name = "Lukasz";
        Customer customer = new Customer(name, "Lopusinski", "Wroclaw", "XXXX");

        String nameResult = customer.getFirstName();
        assertEquals(name, nameResult);
    }

    @Test
    public void test_whenAccountNumberAddedItIsPlacedInCustomer(){
        Long accountNumber = 1000L;
        boolean result = this.customer.addAccountNumber(accountNumber);

        assertTrue(result);
    }

    @Test
    public void test_whenAccountNumberExistsAndItIsAddedAgainThenFalse(){
        Long accountNumber = 1000L;
        this.customer.addAccountNumber(accountNumber);
        boolean result = this.customer.addAccountNumber(accountNumber);

        assertFalse(result);
    }

}