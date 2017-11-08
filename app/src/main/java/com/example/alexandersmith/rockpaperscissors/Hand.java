package com.example.alexandersmith.rockpaperscissors;

/**
 * Created by alexandersmith on 08/11/2017.
 */

public enum Hand {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String name;

     Hand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
