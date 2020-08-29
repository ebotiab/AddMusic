package com.example.android.addmusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // Find the button that starts the app
        Button action = findViewById(R.id.action);

        action.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the drama category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainMenuActivity}
                Intent i = new Intent(MainMenuActivity.this, ComedyMusicActivity.class);

                // Start the new activity
                startActivity(i);
            }
        });

        // Find the button that starts the app
        Button comedy = findViewById(R.id.comedy);

        comedy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the drama category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainMenuActivity}
                Intent menuIntent = new Intent(MainMenuActivity.this, ComedyMusicActivity.class);

                // Start the new activity
                startActivity(menuIntent);
            }
        });

        // Find the button that starts the app
        Button drama = findViewById(R.id.drama);

        drama.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the drama category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainMenuActivity}
                Intent i = new Intent(MainMenuActivity.this, DramaMusicActivity.class);

                // Start the new activity
                startActivity(i);
            }
        });

        // Find the button that starts the app
        Button thriller = findViewById(R.id.thriller);

        thriller.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the drama category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainMenuActivity}
                Intent menuIntent = new Intent(MainMenuActivity.this, ThrillerMusicActivity.class);

                // Start the new activity
                startActivity(menuIntent);
            }
        });
    }
}