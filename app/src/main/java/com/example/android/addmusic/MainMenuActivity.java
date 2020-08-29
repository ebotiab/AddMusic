package com.example.android.addmusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    //    Starts the activity that contains songs with the the action
    public void displayActionMusic (View view){
        Intent i = new Intent(this, ActionMusicActivity.class);
        startActivity(i);
    }

    //    Starts the activity that contains songs with the the comedy
    public void displayComedyMusic (View view){
        Intent i = new Intent(this, ComedyMusicActivity.class);
        startActivity(i);
    }

    //    Starts the activity that contains songs with the the drama
    public void displayDramaMusic (View view){
        Intent i = new Intent(this, DramaMusicActivity.class);
        startActivity(i);
    }

    //    Starts the activity that contains songs with the the thriller
    public void displayThrillerMusic (View view){
        Intent i = new Intent(this, ThrillerMusicActivity.class);
        startActivity(i);
    }
}