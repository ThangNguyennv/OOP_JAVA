package com.patterns.strategy.exercises.order;

import com.patterns.strategy.exercises.strategies.PayByCreditCard;
import com.patterns.strategy.exercises.strategies.PayByPaypal;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrderUsingPaypal(PayByPaypal paypal) {
        paypal.collectPaymentDetails();
    }

    public void processOrderUsingCreditCard(PayByCreditCard creditCard) {
        creditCard.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
