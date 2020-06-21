package com.sda.zdTestSda.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Lukasz", "Lopusinski", "Wroclaw", "XXX");
    }

    @Test
    public void test_createNewCustomerWithPesel(){
        String pesel = "7847144444";
        Customer customer = new Customer("Lukasz", "Lopusinski", "Wroclaw", pesel);

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

    @Test
    public void test_whenCardNumberAddedItIsPlacedInCustomer(){
        Long cardNumber = 1000L;
        boolean result = this.customer.addCardNumber(cardNumber);

        assertTrue(result);
    }

    @Test
    public void test_whenCardNumberExistsAndItIsAddedAgainThenFalse(){
        Long cardNumber = 1000L;
        this.customer.addCardNumber(cardNumber);
        boolean result = this.customer.addCardNumber(cardNumber);

        assertFalse(result);
    }

    @Test
    public void test_whenWantToGetCardNumbersTheyAreThere(){
        Long[] cardNumbers = new Long[20];
        cardNumbers[0] = 100L;
        cardNumbers[1] = 1000L;
        this.customer.addCardNumber(100L);
        this.customer.addCardNumber(1000L);

        assertArrayEquals(cardNumbers, this.customer.getCardNumbers());
    }

    @Test
    public void test_whenWantToGetAccountNumbersTheyAreThere(){
        Long[] accountNumbers = new Long[10];
        accountNumbers[0] = 100L;
        accountNumbers[1] = 1000L;
        this.customer.addAccountNumber(100L);
        this.customer.addAccountNumber(1000L);

        assertArrayEquals(accountNumbers, this.customer.getAccountNumbers());
    }


}