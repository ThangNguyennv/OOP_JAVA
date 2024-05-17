package com.patterns.strategy.exercises.strategies;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cardVerificationValue;

    private static final CreditCard INSTANCE = new CreditCard();

    private CreditCard() {

    }

    CreditCard(String number, String date, String cardVerificationValue) {
        this.amount = 100000;
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
    }

    public static CreditCard getInstance() {
        return INSTANCE;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getCardVerificationValue() {
        return cardVerificationValue;
    }

    public void setCardDetails(String number, String date, String cardVerificationValue) {
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
    }
}