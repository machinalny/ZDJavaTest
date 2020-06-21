package com.sda.zdTestSda.bank;

import com.sda.zdTestSda.bank.exceptions.AccountNotExistsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

}