package com.patterns.singleton.pseudocode;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        Database bar = Database.getInstance();
        foo.connect();
        foo.query("SELECT * FROM nhanvien");
        
        bar.connect();
        bar.disConnect();

        System.out.println("Is the database connected?" + foo.IsConnected());
        System.out.println("Is the database connected?" + bar.IsConnected());
    }
}
