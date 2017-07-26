package com.example.aakashb.tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

import static com.example.aakashb.tictactoe.TicTacToeLogic.TTTElement.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void tictactoetest(){
        TicTacToeLogic.TTTElement[] gamestate1 = {X, EMPTY,EMPTY, X,O,EMPTY, EMPTY, EMPTY, EMPTY};
        TicTacToeLogic.TTTElement[] gamestate2 = {O, O, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,EMPTY};
        TicTacToeLogic.TTTElement[] gamestate3 = {O,O,X,X,O,X,O,X,X};

        int bestmove1 = TicTacToeLogic.getBestMove(gamestate1);
        int bestmove2 = TicTacToeLogic.getBestMove(gamestate2);
        int bestmove3 = TicTacToeLogic.getBestMove(gamestate3);

        assertEquals(bestmove1, 6);
        assertEquals(bestmove2,2);
        assertEquals(bestmove3, -1);






    }
}