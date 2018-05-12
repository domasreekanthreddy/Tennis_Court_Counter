package com.example.sreekanth.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int addScore = 0;
    int addScoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void addTwo(View view){
        addScore = addScore + 2;
        displayScore(addScore);
    }
    public void addTwoB(View view){
        addScoreB = addScoreB + 2;
        displayTeamb(addScoreB);
    }
    public void addThree(View view){
        addScore = addScore + 3;
        displayScore(addScore);
    }
    public void addThreeB(View view){
        addScoreB = addScoreB + 3;
        displayTeamb(addScoreB);
    }
    public void addOne(View view){
        addScore = addScore + 1;
        displayScore(addScore);
    }
    public void addOneB(View view){
        addScoreB = addScoreB + 1;
        displayTeamb(addScoreB);
    }
    public void addZero(View view){
        addScore = 0;
        addScoreB = 0;
        displayScore(addScore);
        displayTeamb(addScore);
    }
    public void displayScore(int score){

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayTeamb(int score){

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



}
