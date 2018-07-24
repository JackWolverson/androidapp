package com.wolverson.jack.igdbapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameInfo extends AppCompatActivity {




    Button SaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_info);

        Intent intent = getIntent();
        final String name = intent.getStringExtra(DisplaySearch.NAME);
        final String summary = intent.getStringExtra(DisplaySearch.SUMMARY);



        final TextView textViewName = findViewById(R.id.GameNameInfoScreen);
        final TextView textViewSummary = findViewById(R.id.GameInfo);

        textViewName.setText(name);
        textViewSummary.setText(summary);


        SaveButton = findViewById(R.id.SaveGame);
        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getSharedPreferences("game", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString( "gameName", textViewName.getText().toString());
                editor.putString( "gameSummary", textViewSummary.getText().toString());
                    editor.apply();
            }
        });

    }

}
