package com.sda.zdTestSda.bank;

import com.sda.zdTestSda.bank.exceptions.AccountNotExistsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class BankSystemTest {


    @Test
    public void test_checkBalanceOnAccount_throwsException(){
        BankSystem bankSystem = new BankSystem();
        AccountNotExistsException thrown = assertThrows(
                AccountNotExistsException.class, () -> bankSystem.checkBalanceOnAccount(100L),
                "Expected checkBalanceOnAccount() to throw AccountNotExistsException, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Account with number"));
    }


    @Test
    public void test_checkBalanceOnAccount_throwsExceptionAssertJ(){
        assertThatThrownBy(() -> {
            BankSystem bankSystem = new BankSystem();
            bankSystem.checkBalanceOnAccount(100L);
        }).isInstanceOf(AccountNotExistsException.class)
                .hasMessageContaining("Account with number");

    }

}