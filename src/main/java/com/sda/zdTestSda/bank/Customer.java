package com.sda.zdTestSda.bank;

public class Customer {

    private final Long customerId;
    private final String pesel;
    private String firstName;
    private String lastName;
    private String address;
    private Long[] accountNumbers = new Long[10];
    private Long[] cardNumbers = new Long[20];

    private int nextAccountNumber = 0;
    private int nextCardNumber = 0;

    public Customer(String firstName, String lastName, String address, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pesel = pesel;
        this.customerId = System.currentTimeMillis();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public Long[] getAccountNumbers() {
        return accountNumbers;
    }

    public boolean addAccountNumber(Long accountNumber) {
        if(this.accountNumberAssigned(accountNumber)){
            return false;
        }
        this.accountNumbers[nextAccountNumber++] = accountNumber;
        return true;
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

    public String getPesel() {
        return pesel;
    }

    private boolean accountNumberAssigned(Long accountNumber) {
        for (int i = 0; i < nextAccountNumber; i++) {
            if (accountNumber.equals(accountNumbers[i])) {
                return true;
            }
        }
        return false;
    }
}
