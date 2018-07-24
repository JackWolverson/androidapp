package com.wolverson.jack.igdbapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.igdb.api_android_java.callback.onSuccessCallback;
import com.igdb.api_android_java.model.APIWrapper;
import com.igdb.api_android_java.model.Parameters;

import org.json.JSONArray;
import org.json.JSONException;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplaySearch extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener{
    public static final String NAME ="com.wolverson.jack.igdbapp.name";
    public static final String SUMMARY ="com.wolverson.jack.igdbapp.summary";

    MyRecyclerViewAdapter adapter;
    List<String> GameNames = new ArrayList<>();
    List<String> GamesDescription = new ArrayList<>();

    @Override
    public void onItemClick(View view, int position) {
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),GameInfo.class);
        String name = adapter.getItem(position);
        String summary = GamesDescription.get(position);
        intent.putExtra(NAME, name);
        intent.putExtra(SUMMARY, summary);
        startActivity(intent);
        finish();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_search);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.SEARCH);

        // Capture the layout's TextView and set the string as its text
       //final TextView textView1 = findViewById(R.id.textView);

        APIWrapper wrapper = new APIWrapper(getApplicationContext(), "81977b0a3389be733bd28fede00a4a5d");
        Parameters params = new Parameters()
                .addSearch(message)
                .addFields("*");

        wrapper.search(APIWrapper.Endpoint.GAMES, params, new onSuccessCallback(){
            @Override
            public void onSuccess(JSONArray result) {
                try {
                    Gson gson = new Gson();
                    for( int i = 0; i< result.length(); i++ ) {
                        System.out.println(result.getJSONObject(i).toString());
                        GamesJSON gamesjson = gson.fromJson(result.getJSONObject(i).toString(), GamesJSON.class);
                        //textView1.append(gamesjson.getName() + "\n");
                        GameNames.add(gamesjson.getName());
                        GamesDescription.add(gamesjson.getSummary());

                        RecyclerView recyclerView = findViewById(R.id.searchResults);
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        adapter = new MyRecyclerViewAdapter(getApplicationContext(), GameNames);
                        recyclerView.setAdapter(adapter);
                        adapter.setClickListener(DisplaySearch.this);


                        }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }



            @Override
            public void onError(VolleyError error) {
                error.printStackTrace();
            }
        });






    }

}
