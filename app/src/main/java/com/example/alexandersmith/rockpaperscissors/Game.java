package com.example.alexandersmith.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by alexandersmith on 08/11/2017.
 */

public class Game {

    Hand hand1;
    Hand hand2;


    public Game(Hand hand1) {
        this.hand1 = hand1;
        this.hand2 = generateHand();
    }


    public Hand getHand1() {
        return hand1;
    }

    public Hand getHand2() {
        return hand2;
    }

    public String compareHand() {
        if (hand1 == hand2) {
            return "It's a draw!";
        }
        if (hand1 == Hand.ROCK && hand2 == Hand.SCISSORS) {
            return "Rock beats Scissors. You won!";
        }
        if (hand1 == Hand.ROCK && hand2 == Hand.PAPER) {
            return "Paper beats Rock. You lost";
        }
        if (hand1 == Hand.PAPER && hand2 == Hand.ROCK) {
            return "Paper beats Rock. You won";
        }
        if (hand1 == Hand.PAPER && hand2 == Hand.SCISSORS) {
            return "Scissors beats Paper. You lost";
        }
        if (hand1 == Hand.SCISSORS && hand2 == Hand.PAPER) {
            return "Scissors beats Paper. You won";
        }
        if (hand1 == Hand.SCISSORS && hand2 == Hand.ROCK) {
            return "Rock beats Scissors. You lost";
        }
        return null;
    }

    public Hand generateHand(){
        ArrayList<Hand> hands = new ArrayList<Hand>();
        hands.add(Hand.ROCK);
        hands.add(Hand.PAPER);
        hands.add(Hand.SCISSORS);
        Collections.shuffle(hands);
        return hands.get(0);
    }
}
