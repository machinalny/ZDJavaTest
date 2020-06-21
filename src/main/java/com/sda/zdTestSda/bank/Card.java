package com.sda.zdTestSda.bank;

public class Card {

    private final String ownerName;
    private final Long number;
    private final Long accountNumber;
    private String pin;
    private int pinTries;
    private boolean blocked = false;

    public Card(String ownerName, Long accountNumber, Long number){
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.number = number;
        this.pin = "0000";
    }

    public Long getNumber() {
        return number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public boolean changePin(String oldPin, String newPin){
        if (this.checkPin(oldPin)){
            this.pin = newPin;
            return true;
        }
        else return false;
    }

    public boolean checkPin(String pin){
       if(this.pin.equals(pin)){
           pinTries = 0;
           return true;
       } else {
           pinTries++;
           pinTries++;
           if (pinTries == 3){
               this.blocked = true;
           }
           return false;
       }
    }


    public boolean isBlocked() {
        return blocked;
    }

}
