package com.patterns.strategy.exercises.strategies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    public PayByCreditCard() {
    }

    @Override
    public void collectPaymentDetails() {
        String number = readInput("Enter the card number: ");
        String date = readInput("Enter the card expiration date 'mm/dd': ");
        String cardVerificationValue = readInput("Enter the card Verification Value code: ");

        if (CreditCardValidator.isValid(number)) {
            card = new CreditCard(number, date, cardVerificationValue);
        }
    }

    private String readInput(String prompt) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(prompt);
            return reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
            return "";
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }

    private boolean cardIsPresent() {
        return card != null;
    }

    public static PayStrategy getInstance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInstance'");
    }
}