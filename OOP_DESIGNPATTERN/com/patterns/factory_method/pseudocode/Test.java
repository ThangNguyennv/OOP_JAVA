package com.patterns.factory_method.pseudocode;

public class Test {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new Webdialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}