package com.wolverson.jack.igdbapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Saved extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);

        SharedPreferences sharedPref = getSharedPreferences("game", Context.MODE_PRIVATE);
        String loadGameName = sharedPref.getString("gameName","");
        String loadGameSummary = sharedPref.getString("gameSummary","");

         TextView textViewName = findViewById(R.id.gameNameSaved);
         TextView textViewSummary = findViewById(R.id.gameSummarySaved);

        textViewName.setText(loadGameName);
        textViewSummary.setText(loadGameSummary);

    }
}
