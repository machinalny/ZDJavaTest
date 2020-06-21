package com.sda.zdTestSda.bank;

import com.sda.zdTestSda.bank.exceptions.AccountNotExistsException;

public class BankSystem {
    private Account[] accounts = new Account[100];
    private Customer[] customers = new Customer[100];
    private Card[] cards = new Card[100];
    private Terminal[] terminals = new Terminal[100];
    private int nextCustomerNumber = 0;
    private int nextAccountNumber = 0;
    private int nextCardNumber = 0;
    private int nextTerminal = 0;

    public BankSystem() {
    }

    public BankSystem(Account[] accounts, Customer[] customers, Card[] cards) {
        this.accounts = accounts;
        this.customers = customers;
        this.cards = cards;
    }

    public void addCustomer(Customer customer) {
        this.customers[nextCardNumber++] = customer;
    }

    public void addTerminal(Terminal terminal){
        terminals[nextTerminal++] = terminal;
    }

    public void addAccount(Terminal terminal){
        Account account = new Account(System.currentTimeMillis(), 0.0);
        this.accounts[nextAccountNumber++] = account;
        terminal.setAccountNumber(account.getNumber());
    }

    public void addAccount(Customer customer) {
        this.addAccountWithDeposit(customer, 0.0);
    }

    public void addAccountWithDeposit(Customer customer, Double deposit) {
        Account account = new Account(System.currentTimeMillis(), deposit);
        this.accounts[nextAccountNumber++] = account;
        customer.addAccountNumber(account.getNumber());
    }

    public Card addCard(Customer customer) {
        Card card = new Card(customer.getFirstName() + " " + customer.getLastName(), customer.getAccountNumbers()[0], System.currentTimeMillis());
        this.cards[nextCardNumber] = card;
        customer.addCardNumber(card.getNumber());
        return card;
    }

    private boolean customerExists(Customer customer) {
        for (int i = 0; i < nextCustomerNumber; i++) {
            Customer customerToCheck = this.customers[i];

            if (customer.getCustomerId().equals(customerToCheck.getCustomerId())) {
                return true;
            }
        }
        return false;
    }

    public Double checkBalanceOnAccount(Long accountNumber) throws AccountNotExistsException {
        Account account = this.getAccountByNumber(accountNumber);
        if (account != null) {
            return account.getBalance();
        }
        throw new AccountNotExistsException("Account with number " + accountNumber + " does not exists");
    }

    private boolean accountExistsByNumber(Long accountNumber) {
        for (int i = 0; i < nextAccountNumber; i++) {
            Account accountToCheck = this.accounts[i];

            if (accountNumber.equals(accountToCheck.getNumber())) {
                return true;
            }
        }
        return false;
    }

    private Account getAccountByNumber(Long accountNumber) {
        for (int i = 0; i < nextAccountNumber; i++) {
            Account accountToCheck = this.accounts[i];

            if (accountNumber.equals(accountToCheck.getNumber())) {
                return accountToCheck;
            }
        }
        return null;
    }

    public boolean transferMoneyFromTo(Long fromAccountNumber, Long toAccountNumber, Double amount) {
        if (!this.accountExistsByNumber(fromAccountNumber) || !this.accountExistsByNumber(toAccountNumber)) {
            System.out.println("There is a problem with account numbers, please check it");
            return false;
        }
        Account fromAccount = this.getAccountByNumber(fromAccountNumber);
        Account toAccount = this.getAccountByNumber(fromAccountNumber);
        fromAccount.transferMoney(-amount);
        toAccount.transferMoney(amount);
        return true;

    }


}
