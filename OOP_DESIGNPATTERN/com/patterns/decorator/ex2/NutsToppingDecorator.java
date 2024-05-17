package com.patterns.decorator.ex2;

public class NutsToppingDecorator extends ToppingDecorator {

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return "Nut " + this.iceCream.getDescription();
    }
    public String addTopping() {
        return " with Nut";
    }
}
