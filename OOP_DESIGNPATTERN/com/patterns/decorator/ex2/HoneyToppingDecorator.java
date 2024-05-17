package com.patterns.decorator.ex2;

public class HoneyToppingDecorator extends ToppingDecorator {

    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return "Honey " + this.iceCream.getDescription();
    }
    public String addTopping() {
        return " with Honey";
    }
}
