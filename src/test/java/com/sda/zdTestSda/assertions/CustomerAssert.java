package com.sda.zdTestSda.assertions;

import com.sda.zdTestSda.bank.Customer;
import org.assertj.core.api.AbstractAssert;

import java.util.Objects;

public class CustomerAssert extends AbstractAssert<CustomerAssert, Customer> {
    public CustomerAssert(Customer customer) {
        super(customer, CustomerAssert.class);
    }

    public static CustomerAssert assertThat(Customer actual) {
        return new CustomerAssert(actual);
    }

    public CustomerAssert hasFirstName(String firstName) {
        isNotNull();

        if (!Objects.equals(actual.getFirstName(), firstName)) {
            failWithMessage("Expected customer first name to be <%s> but was <%s>", firstName, actual.getFirstName());
        }
        return this;
    }
}
