package com.sda.zdTestSda.bank;

public class Terminal {

    private final Long id;
    private Long accountNumber;
    private BankSystem bankSystem = null;

    public Terminal() {
        this.id = System.currentTimeMillis();
    }

    public Terminal(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber){
        this.accountNumber = accountNumber;
    }

    public void connectToBankSystem(BankSystem bankSystem){
        bankSystem.addTerminal(this);
        bankSystem.addAccount(this);
        this.bankSystem = bankSystem;
    }

    public void disconnectFromBankSystem(){
        this.bankSystem = null;
    }

    public int pay(Card card, String pin, Double amount){
        if(bankSystem == null){
            return 9;
        }
        if (card.isBlocked()){
            return 3;
        }
        if (card.checkPin(pin)){
            if(bankSystem.transferMoneyFromTo(card.getAccountNumber(), this.accountNumber, amount)) {
                return 0;
            } else {
                return 2;
            }
        }
        return 1;
    }

}
