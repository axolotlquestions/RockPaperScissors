package com.example.alexandersmith.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.ResultSet;

public class MainActivity extends AppCompatActivity {

    Button RockButton;
    Button PaperButton;
    Button ScissorsButton;
    TextView ComputerHand;
    TextView Results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RockButton = (Button)findViewById(R.id.rockButton);
        PaperButton = (Button)findViewById(R.id.paperButton);
        ScissorsButton = (Button)findViewById(R.id.scissorsButton);
        ComputerHand = (TextView)findViewById(R.id.computerHandView);
        Results = (TextView)findViewById(R.id.ResultView);


    }

    public void playRock(View MainActivity) {
        Game game = new Game(Hand.ROCK);
        String outcome = game.compareHand();
        ComputerHand.setText("Computer chose: " + game.getHand2().getName());
        Results.setText(outcome);
    }

    public void playPaper(View MainActivity){
        Game game = new Game(Hand.PAPER);
        String outcome = game.compareHand();
        ComputerHand.setText("Computer chose: " + game.getHand2().getName());
        Results.setText(outcome);
    }

    public void playScissors(View MainActivity){
        Game game = new Game(Hand.SCISSORS);
        String outcome = game.compareHand();
        ComputerHand.setText("Computer chose: " + game.getHand2().getName());
        Results.setText(outcome);
    }
}
