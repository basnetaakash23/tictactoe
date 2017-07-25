package com.example.aakashb.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.example.aakashb.tictactoe.TicTacToeLogic.TTTElement.*;

public class MainActivity extends AppCompatActivity {
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mNewGame;

    TicTacToeLogic.TTTElement[] gameState =
            {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);
        mButton7 = (Button) findViewById(R.id.button7);
        mButton8 = (Button) findViewById(R.id.button8);
        mButton9 = (Button) findViewById(R.id.button9);
        mNewGame = (Button) findViewById(R.id.button10);

        mNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set new game button's visibility as invisible after the game has started
                mNewGame.setVisibility(view.INVISIBLE);
                //reset the gameState array to all Empty, text inside button to empty and clickability to true
                mButton1.setText(" ");
                mButton2.setText(" ");
                mButton3.setText(" ");
                mButton4.setText(" ");
                mButton5.setText(" ");
                mButton6.setText(" ");
                mButton7.setText(" ");
                mButton8.setText(" ");
                mButton9.setText(" ");
                mButton1.setClickable(true);
                mButton2.setClickable(true);
                mButton3.setClickable(true);
                mButton4.setClickable(true);
                mButton5.setClickable(true);
                mButton6.setClickable(true);
                mButton7.setClickable(true);
                mButton8.setClickable(true);
                mButton9.setClickable(true);
                for (int i = 0; i < gameState.length; i++){
                    gameState[i] = EMPTY;
                }
            }


        });
    }

    public void checkStatus(View view) {

        if (view.getId() == R.id.button1) {
            mButton1.setText("X");
            mButton1.setClickable(false);
            didPressGameButton(0);

        } else if (view.getId() == R.id.button2) {
            mButton2.setText("X");
            mButton2.setClickable(false);
            didPressGameButton(1);


        } else if (view.getId() == R.id.button3) {
            mButton3.setText("X");
            mButton3.setClickable(false);
            didPressGameButton(2);

        } else if (view.getId() == R.id.button4) {
            mButton4.setText("X");
            mButton4.setClickable(false);
            didPressGameButton(3);

        } else if (view.getId() == R.id.button5) {
            mButton5.setText("X");
            mButton5.setClickable(false);
            didPressGameButton(4);
        } else if (view.getId() == R.id.button6) {
            mButton6.setText("X");
            mButton6.setClickable(false);
            didPressGameButton(5);
        } else if (view.getId() == R.id.button7) {
            mButton7.setText("X");
            mButton7.setClickable(false);
            didPressGameButton(6);
        } else if (view.getId() == R.id.button8) {
            mButton8.setText("X");
            mButton8.setClickable(false);
            didPressGameButton(7);
        } else if (view.getId() == R.id.button9) {
            mButton9.setText("X");
            mButton9.setClickable(false);
            didPressGameButton(8);
        }

        /*else if(view.getId()==R.id.button10){
            mButton1.setClickable(true);
            mButton2.setClickable(true);
            mButton3.setClickable(true);
            mButton4.setClickable(true);
            mButton5.setClickable(true);
            mButton6.setClickable(true);
            mButton7.setClickable(true);
            mButton8.setClickable(true);
            mButton9.setClickable(true);

        }
        */


    }


    private void didPressGameButton(int index) {

        Log.i("Debug","index " + index);
        gameState[index] = TicTacToeLogic.TTTElement.X;



        //find the best move and update the button and text inside it and make the button unclickable
        if (!TicTacToeLogic.isGameOver(gameState)) {
            int bestMove = TicTacToeLogic.getBestMove(gameState);
            if (bestMove == 0) {
                mButton1.setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButton1.setClickable(false);
            } else if (bestMove == 1) {
                mButton2.setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButton2.setClickable(false);
            } else if (bestMove == 2) {
                mButton3.setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButton3.setClickable(false);
            } else if (bestMove == 3) {
                mButton4.setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButton4.setClickable(false);
            } else if (bestMove == 4) {
                mButton5.setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButton5.setClickable(false);
            } else if (bestMove == 5) {
                mButton6.setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButton6.setClickable(false);
            } else if (bestMove == 6) {
                mButton7.setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButton7.setClickable(false);
            } else if (bestMove == 7) {
                mButton8.setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButton8.setClickable(false);
            } else if (bestMove == 8) {
                mButton9.setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButton9.setClickable(false);
            }

        }
        //make the new game button visible and set the clickability of all the buttons to false
        if(TicTacToeLogic.isGameOver(gameState)){

                mButton1.setClickable(false);
                mButton2.setClickable(false);
                mButton3.setClickable(false);
                mButton4.setClickable(false);
                mButton5.setClickable(false);
                mButton6.setClickable(false);
                mButton7.setClickable(false);
                mButton8.setClickable(false);
                mButton9.setClickable(false);
                mNewGame.setVisibility(View.VISIBLE);


        }

    }

}











