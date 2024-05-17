package com.patterns.decorator.ex2;

public class Client {
    public static void main(String[] args) {
        IceCream vanillaIcecream = new VanillaIceCream();
        IceCream chocolateIcecream = new ChocolateIceCream();
        IceCream strawberryIcecream = new StrawberryIceCream();
        System.out.println(vanillaIcecream.getDescription());
        System.out.println(chocolateIcecream.getDescription());
        System.out.println(strawberryIcecream.getDescription());

        IceCream honeyVaniIcecream = new HoneyToppingDecorator(vanillaIcecream);
        System.out.println(honeyVaniIcecream.getDescription());

        IceCream nutVaniIcecream = new NutsToppingDecorator(vanillaIcecream);
        System.out.println(nutVaniIcecream.getDescription());

        IceCream nutHoneyVaniIcecream = new NutsToppingDecorator(honeyVaniIcecream);
        System.out.println(nutHoneyVaniIcecream.getDescription());
    }
}
