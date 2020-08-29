package com.example.android.addmusic;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ComedyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList();
        songs.add(new Song("Don't Stop Me now", "Queen"));
        songs.add(new Song("Watermelon Sugar", "Harry Styles"));
        songs.add(new Song("Happy", "Pharrel Williams"));
        songs.add(new Song("La gallina turuleca", "MILIKI"));
        songs.add(new Song("All Star", "Smash Mouth"));
        songs.add(new Song("Only Human", "Jonas Brothers"));
        songs.add(new Song("September", "Earth Wind & Fire"));
        songs.add(new Song("Kung fu Fighting", "CeeLo Green, Jack Black"));
        songs.add(new Song("Party Rock", "LMFAO"));




        // Create an {@link SongAdapter}, whose data source is a list of {@link Songs}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}