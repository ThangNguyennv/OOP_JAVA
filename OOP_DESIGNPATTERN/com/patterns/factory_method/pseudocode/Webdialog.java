package com.patterns.factory_method.pseudocode;

public class Webdialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
