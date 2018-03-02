package com.example.android.hockeyscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    TextView team_a_score, team_b_score, team_a_fouls, team_b_fouls;

    int scoreA = 0;
    int scoreB = 0;
    int foulsA = 0;
    int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);

        team_a_score = findViewById(R.id.team_a_score);
        team_b_score = findViewById(R.id.team_b_score);
        team_a_fouls = findViewById(R.id.team_a_fouls);
        team_b_fouls = findViewById(R.id.team_b_fouls);
    }

    public void display(TextView text, int number){
        text.setText(String.valueOf(number));
    }

    public void displayForTeamA() {
        display(team_a_score, scoreA);
    }

    public void displayForTeamB() {
        display(team_b_score, scoreB);
    }

    public void displayFoulsForTeamA() {
        display(team_a_fouls, foulsA);
    }

    public void displayFoulsForTeamB() {
        display(team_b_fouls, foulsB);
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
