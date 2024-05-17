package com.patterns.observer.exercise_1;

import static com.patterns.observer.exercise_1.Event.NEW_ITEM;
import static com.patterns.observer.exercise_1.Event.SALE;

public class Store {
    private final NotificationService notificationService;
    public Store() {
        notificationService = new NotificationService();
    }
    public void newItemPromotion() {
        notificationService.notifyCustomers(NEW_ITEM);
    }
    public void salePromotion() {
        notificationService.notifyCustomers(SALE);
    }
    public NotificationService getService() {
        return notificationService;
    }
}