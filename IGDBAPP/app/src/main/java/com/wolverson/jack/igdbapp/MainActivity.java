package com.wolverson.jack.igdbapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String SEARCH ="com.wolverson.jack.igdbapp.search";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Search(View view) {
        Intent intent = new Intent(this, DisplaySearch.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(SEARCH, message);
        startActivity(intent);
    }
    public void OpenSavedView(View view){
        Intent intent = new Intent(getApplicationContext(),Saved.class);
        startActivity(intent);
        finish();
    }
}
