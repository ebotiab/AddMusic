package com.example.android.addmusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button that starts the app
        ConstraintLayout start = findViewById(R.id.main);

        start.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the drama category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainMenuActivity}
                Intent menuIntent = new Intent(MainActivity.this, MainMenuActivity.class);

                // Start the new activity
                startActivity(menuIntent);
            }
        });
    }
}