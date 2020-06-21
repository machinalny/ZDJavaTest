package com.sda.zdTestSda.bank;

public class Customer {

    private final Long customerId;
    private String firstName;
    private String lastName;
    private String address;
    private Long[] accountNumbers = new Long[10];
    private Long[] cardNumbers = new Long[20];

    private int nextAccountNumber = 0;
    private int nextCardNumber = 0;

    public Customer(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.customerId = System.currentTimeMillis();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long[] getAccountNumbers() {
        return accountNumbers;
    }

    public void addAccountNumber(Long accountNumber) {
        this.accountNumbers[nextAccountNumber++] = accountNumber;
    }

    public void addCardNumber(Long cardNumber) {
        this.cardNumbers[nextAccountNumber++] = cardNumber;
    }

    public Long[] getCardNumbers() {
        return cardNumbers;
    }


    public Long getCustomerId() {
        return customerId;
    }
}
