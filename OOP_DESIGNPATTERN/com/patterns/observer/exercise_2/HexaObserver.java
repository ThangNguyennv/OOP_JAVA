package com.patterns.observer.exercise_2;
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
    }
    public void update() {
        System.out.println("HexaObserver new update: " + subject.getState());
    }
}
