package com.patterns.abstract_factory.pseudocode;

public class MacFactory implements GUIFactory{
    public Button createButton() {
        return new MacButton();
    }

    public  Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
