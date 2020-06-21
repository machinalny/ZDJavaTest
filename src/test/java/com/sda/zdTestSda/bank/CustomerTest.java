package com.sda.zdTestSda.bank;

import com.sda.zdTestSda.assertions.CustomerAssert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CustomerTest {

    @Test
    void getFirstName() {
        Customer customer = new Customer("Lukasz", "Lopusinski", "Wroclaw");
        CustomerAssert.assertThat(customer)
                .hasFirstName("Lukasz");
    }

    @Test
    void setFirstName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getAddress() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void getAccountNumbers() {
    }

    @Test
    void addAccountNumber() {
    }

    @Test
    void addCardNumber() {
    }

    @Test
    void getCardNumbers() {
    }

    @Test
    void getCustomerId() {
    }
}