package com.study.potheraj.soccerscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    int goalsTeamA = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;
    int goalsTeamB = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the Goal button is clicked for Team A.
     */
    public void addGoalForTeamA(View view) {
        goalsTeamA = goalsTeamA + 1;
        addScoreOrCardToDisplay(goalsTeamA, findViewById(R.id.teamA_score_text_view));
    }

    /**
     * This method is called when the Yellow Card button is clicked for Team A.
     */
    public void addYellowCardForTeamA(View view) {
        yellowCardTeamA = yellowCardTeamA + 1;
        addScoreOrCardToDisplay(yellowCardTeamA, findViewById(R.id.teamA_yellowCard_text_view));
    }

    /**
     * This method is called when the Red Card button is clicked for Team A.
     */
    public void addRedCardForTeamA(View view) {
        redCardTeamA = redCardTeamA + 1;
        addScoreOrCardToDisplay(redCardTeamA, findViewById(R.id.teamA_redCard_text_view));
    }


    /**
     * This method is called when the Goal button is clicked for Team B.
     */
    public void addGoalForTeamB(View view) {
        goalsTeamB = goalsTeamB + 1;
        addScoreOrCardToDisplay(goalsTeamB, findViewById(R.id.teamB_score_text_view));
    }

    /**
     * This method is called when the Yellow Card button is clicked for Team A.
     */
    public void addYellowCardForTeamB(View view) {
        yellowCardTeamB = yellowCardTeamB + 1;
        addScoreOrCardToDisplay(yellowCardTeamB, findViewById(R.id.teamB_yellowCard_text_view));
    }

    /**
     * This method is called when the Red Card button is clicked for Team A.
     */
    public void addRedCardForTeamB(View view) {
        redCardTeamB = redCardTeamB + 1;
        addScoreOrCardToDisplay(redCardTeamB, findViewById(R.id.teamB_redCard_text_view));
    }


    /**
     * This method is called when the Reset Card button is clicked.
     */
    public void resetGoalsAndCardsForBothTeams(View view) {
        resetGoalsAndCardsForBothTeams();
    }

    /**
     * This method is used to increment the team goal or cards and to display the updated value on screen.
     */
    private void addScoreOrCardToDisplay(int number, View view) {
        TextView scoreOrCardTextView = (TextView) (view);
        scoreOrCardTextView.setText("" + number);
    }

    /**
     * This method is used to reset the goals and cards for both teams to 0.
     */
    private void resetGoalsAndCardsForBothTeams() {
        goalsTeamA = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;
        goalsTeamB = 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;
        addScoreOrCardToDisplay(goalsTeamA, findViewById(R.id.teamA_score_text_view));
        addScoreOrCardToDisplay(yellowCardTeamA, findViewById(R.id.teamA_yellowCard_text_view));
        addScoreOrCardToDisplay(redCardTeamA, findViewById(R.id.teamA_redCard_text_view));
        addScoreOrCardToDisplay(goalsTeamB, findViewById(R.id.teamB_score_text_view));
        addScoreOrCardToDisplay(yellowCardTeamB, findViewById(R.id.teamB_yellowCard_text_view));
        addScoreOrCardToDisplay(redCardTeamB, findViewById(R.id.teamB_redCard_text_view));
    }

}
