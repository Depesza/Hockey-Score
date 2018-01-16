package com.example.android.hockeyscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int foulsA = 0;
    int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void displayFoulsForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(foulsA));
    }

    public void displayFoulsForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(foulsB));
    }

    public void increment(View view) {
        scoreA = scoreA + 1;
        displayForTeamA();
    }

    public void pen2(View view) {
        foulsA = foulsA + 2;
        displayFoulsForTeamA();
    }

    public void pen5(View view) {
        foulsA = foulsA + 5;
        displayFoulsForTeamA();
    }

    public void incrementB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB();
    }

    public void pen2B(View view) {
        foulsB = foulsB + 2;
        displayFoulsForTeamB();
    }

    public void pen5B(View view) {
        foulsB = foulsB + 5;
        displayFoulsForTeamB();
    }

    public void reset(View view) {
        scoreB = 0;
        scoreA = 0;
        foulsA = 0;
        foulsB = 0;
        displayForTeamA();
        displayForTeamB();
        displayFoulsForTeamA();
        displayFoulsForTeamB();
    }
}
