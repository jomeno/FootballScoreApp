package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamScore1 = 0;
    int teamScore2 = 0;
    int teamFoul1 = 0;
    int teamFoul2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Displays the given foul for team 1*/
    public void setTeamFoul1(int score) {
        TextView foulTextView = (TextView) findViewById(R.id.team_1_foul);
        foulTextView.setText("Fouls: " + String.valueOf(score));
    }

    /*Displays the given foul for team 2*/
    public void setTeamFoul2(int score) {
        TextView foulTextView = (TextView) findViewById(R.id.team_2_foul);
        foulTextView.setText("Fouls: " + String.valueOf(score));
    }

    /*Displays the given score for team 1*/
    public void setTeamScore1(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_1_score);
        scoreTextView.setText(String.valueOf(score));
    }

    /*Displays the given score for team 2*/
    public void setTeamScore2(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_2_score);
        scoreTextView.setText(String.valueOf(score));
    }

    /* Add 1 point for team 1*/
    public void addGoal1(View v) {
        teamScore1 += 1;
        setTeamScore1(teamScore1);
    }

    /* Add 1 point for team 2*/
    public void addGoal2(View v) {
        teamScore2 += 1;
        setTeamScore2(teamScore2);
    }

    public void addFoul1(View v) {
        teamFoul1 += 1;
        setTeamFoul1(teamFoul1);
    }

    public void addFoul2(View v) {
        teamFoul2 += 1;
        setTeamFoul2(teamFoul2);
    }
    /* Resets game scores*/
    public void resetScores(View v) {
        teamScore1 = 0;
        teamScore2 = 0;
        setTeamScore1(teamScore1);
        setTeamScore2(teamScore2);

        teamFoul1 = 0;
        teamFoul2 = 0;
        setTeamFoul1(teamScore1);
        setTeamFoul2(teamScore2);
    }
}
