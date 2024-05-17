package com.patterns.singleton.pseudocode;

public class Database {
    private static Database instance;
    private boolean connected;

    private Database() {
        connected = false;
    }

    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void connect() {
        if (!connected) {
            System.out.println("Connected to the database");
            connected = true;
        } else {
            System.out.println("Already Connected to the database");
        }
    }

    public void disConnect() {
        if (connected) {
            System.out.println("Disconnected to the database");
            connected = false;
        } else {
            System.out.println("Already Disconnected to the database");
        }
    }

    public void query(String sql) {
        if (connected) {
            System.out.println("Executing query: " + sql);
        } else {
            System.out.println("Cannot excute query because you are not connected database");
        }
    }

    public boolean IsConnected() {
        if (connected) {
            return true;
        } else {
            return false;
        }
    }
}


