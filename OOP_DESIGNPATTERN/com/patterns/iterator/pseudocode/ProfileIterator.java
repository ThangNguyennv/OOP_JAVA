package com.patterns.iterator.pseudocode;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}