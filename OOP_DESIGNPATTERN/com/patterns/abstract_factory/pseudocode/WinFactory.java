package com.patterns.abstract_factory.pseudocode;

public class WinFactory implements GUIFactory{
    public Button createButton() {
        return new WinButton();
    }

    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
