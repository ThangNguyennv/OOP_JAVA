package com.patterns.iterator.pseudocode;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;
    private boolean workingWithFacebook;
    private boolean workingWithLinkedIn;

    public void configure() {
        // Configure the network and spammer objects
        if (workingWithFacebook) {
            List<Profile> cache = new ArrayList<>(); // You need to provide the cache of Facebook profiles
            this.network = new Facebook(cache);
        } else if (workingWithLinkedIn) {
            List<Profile> cache = new ArrayList<>(); // You need to provide the cache of LinkedIn profiles
            this.network = new LinkedIn(cache);
        } else {
            throw new IllegalStateException("No social network configured.");
        }
        this.spammer = new SocialSpammer(network);
    }

    public void sendSpamToFriends(String profileEmail) {
        spammer.sendSpamToFriends(profileEmail, "Very important message");
    }

    public void sendSpamToCoworkers(String profileEmail) {
        spammer.sendSpamToCoworkers(profileEmail, "Very important message");
    }
}