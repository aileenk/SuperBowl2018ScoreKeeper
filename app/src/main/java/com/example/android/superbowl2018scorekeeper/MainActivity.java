package com.example.android.superbowl2018scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String Eagles_score = "eagles_score";
    static final String Patriots_score = "patriots_score";
    //Tracks the score for the Eagles.
    int eagles = 0;
    //Tracks the score for the Patriots.
    int patriots = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // Save custom values into the bundle
        savedInstanceState.putInt("eagles_score", eagles);
        savedInstanceState.putInt("patriots_score", patriots);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Restore state members from saved instance
        eagles = savedInstanceState.getInt(Eagles_score);
        patriots = savedInstanceState.getInt(Patriots_score);
        displayForEagles(eagles);
        displayForPatriots(patriots);
    }

    /**
     * Displays the given score for the Eagles.
     */
    public void displayForEagles(int score) {
        TextView scoreView = findViewById(R.id.eagles_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 6 points to the Eagles score for a Touchdown.
     */
    public void touchdownEagles(View v) {
        eagles = eagles + 6;
        displayForEagles(eagles);
    }

    /**
     * Adds 1 point to the Eagles score for a Conversion.
     */
    public void conversionEagles(View v) {
        eagles = eagles + 1;
        displayForEagles(eagles);
    }

    /**
     * Adds 3 points to the Eagles score for a Field Goal.
     */
    public void fieldGoalEagles(View v) {
        eagles = eagles + 3;
        displayForEagles(eagles);
    }

    /**
     * Adds 2 points to the Eagles score for a Safety.
     */
    public void safetyEagles(View v) {
        eagles = eagles + 2;
        displayForEagles(eagles);
    }

    /**
     * Displays the given score for the Patriots.
     */
    public void displayForPatriots(int score) {
        TextView scoreView = findViewById(R.id.patriots_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 6 points to the Patriots score for a Touchdown.
     */
    public void touchdownPatriots(View v) {
        patriots = patriots + 6;
        displayForPatriots(patriots);
    }

    /**
     * Adds 1 point to the Patriots score for a Conversion.
     */
    public void conversionPatriots(View v) {
        patriots = patriots + 1;
        displayForPatriots(patriots);
    }

    /**
     * Adds 3 points to the Patriots score for a Field Goal.
     */
    public void fieldGoalPatriots(View v) {
        patriots = patriots + 3;
        displayForPatriots(patriots);
    }

    /**
     * Adds 2 points to the Patriots score for a Safety.
     */
    public void safetyPatriots(View v) {
        patriots = patriots + 2;
        displayForPatriots(patriots);
    }

    /**
     * Resets the scores to 0.
     */
    public void reset(View v) {
        eagles = 0;
        patriots = 0;
        displayForEagles(0);
        displayForPatriots(0);
    }

}
