package com.example.android.addmusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the action category
        TextView action = findViewById(R.id.action);

        // Set a click listener on that View
        action.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the action category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ActionMusicActivity}
                Intent actionIntent = new Intent(MainMenuActivity.this, ActionMusicActivity.class);

                // Start the new activity
                startActivity(actionIntent);
            }
        });

        // Find the View that shows the comedy category
        TextView comedy = findViewById(R.id.comedy);

        // Set a click listener on that View
        comedy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the comedy category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ComedyMusicActivity}
                Intent comedyIntent = new Intent(MainMenuActivity.this, ComedyMusicActivity.class);

                // Start the new activity
                startActivity(comedyIntent);
            }
        });


        // Find the View that shows the drama category
        TextView drama = findViewById(R.id.drama);

        drama.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the drama category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DramaMusicActivity}
                Intent dramaIntent = new Intent(MainMenuActivity.this, DramaMusicActivity.class);

                // Start the new activity
                startActivity(dramaIntent);
            }
        });

    }
}