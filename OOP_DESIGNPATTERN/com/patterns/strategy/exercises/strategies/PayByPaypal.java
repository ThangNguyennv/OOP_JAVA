package com.patterns.strategy.exercises.strategies;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPaypal implements PayStrategy {
    private static final Map<String, String> DATABASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    private static final PayByPaypal INSTANCE = new PayByPaypal();

    private PayByPaypal() {
        DATABASE.put("amanda1985", "amanda@ya.com");
        DATABASE.put("qwerty", "john@amazon.eu");
    }

    public static PayByPaypal getInstance() {
        return INSTANCE;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("Enter the user's email: ");
                email = READER.readLine();
                System.out.println("Enter the password: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATABASE.get(password)));
        return signedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using Paypal.");
            return true;
        }
        return false;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}