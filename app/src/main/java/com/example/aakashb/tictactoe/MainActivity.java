package com.example.aakashb.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                mNewGame.setVisibility(View.INVISIBLE);
                //reset the gameState array to all Empty, text inside button to empty and clickability to true
                mButton1.setText("");
                mButton2.setText("");
                mButton3.setText("");
                mButton4.setText("");
                mButton5.setText("");
                mButton6.setText("");
                mButton7.setText("");
                mButton8.setText("");
                mButton9.setText("");
            }


        });

            mButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    didPressGameButton(mbutton1);

                }
            });




        private void didPressGameButton(int index) {
            mButtons.get(index).setText("X");
            gameState[index] = TicTacToeLogic.TTTElement.X;
            mButtons.get(index).setClickable(false);

            //find the best move and update the button and text inside it and make the button unclickable
            if (!TicTacToeLogic.isGameOver(gameState)) {
                int bestMove = TicTacToeLogic.getBestMove(gameState);
                mButtons.get(bestMove).setText("O");
                gameState[bestMove] = TicTacToeLogic.TTTElement.O;
                mButtons.get(bestMove).setClickable(false);
            }
            //make the new game button visible and set the clickability of all the buttons to false
            if(TicTacToeLogic.isGameOver(gameState)){
                for(int i= 0; i < mButtons.size() ; i++){
                    mButtons.get(i).setClickable(false);
                }
                mNewGame.setVisibility(View.VISIBLE);
            }
        }






        int bestMove = TicTacToeLogic.getBestMove(gameState);

        mButton[bestMove].setText("0");

    }
}
