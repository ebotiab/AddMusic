package com.example.android.addmusic;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DramaMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList();
        songs.add(new Song("When the party's over", "Billie Ellish"));
        songs.add(new Song("Never an Absolution", "James Horner"));
        songs.add(new Song("Thinking Out Loud", "Ed Sheeran"));
        songs.add(new Song("All of MeAll of Me", "John Legend"));
        songs.add(new Song("Perfect", "Ed Sheeran"));
        songs.add(new Song("Oogway Ascends", "Hans Zimmer"));

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
