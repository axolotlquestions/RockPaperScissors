package com.example.alexandersmith.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandersmith on 08/11/2017.
 */
public class GameTest {

    Game game;
    Game game1;
    Game game2;
    Game game3;

    @Before
    public void before(){
        game = new Game(Hand.ROCK);
        game1 = new Game(Hand.SCISSORS);
        game2 = new Game(Hand.PAPER);
        game3 = new Game(Hand.PAPER);
    }

    @Test
    public void getHand1() throws Exception {
        assertEquals("Rock", game.getHand1().getName());
    }

    @Test
    public void getHand2() throws Exception {
        assertEquals("Paper", game.getHand2().getName());

    }

    @Test
    public void testGenerateHand(){
        assertEquals(Hand.PAPER, game.generateHand());
    }

}