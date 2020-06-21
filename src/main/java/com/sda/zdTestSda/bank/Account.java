package com.sda.zdTestSda.bank;

public class Account {

    private Long number;
    private Double balance;

    public Account(Long number) {
        this(number, 0.0);
    }


    public Account(Long number, double balance) {
        this.number = number;
        this.balance = balance;
    }


    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    private void setBalance(Double balance) {
        this.balance = balance;
    }

    public void transferMoney(Double value) {
        this.balance += value;
    }


}
