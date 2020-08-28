package com.example.android.addmusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song>  {

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        // Get the name from the current Song object and set this text on
        // the nameTextView.
        nameTextView.setText(currentSong.getName());

        // Find the TextView in the list_item.xml layout with the ID interpreter_text_view.
        TextView interpreterTextView = listItemView.findViewById(R.id.interpreter_text_view);
        // Get the interpreter from the currentSong object and set this text on
        // the interpreter TextView.
        interpreterTextView.setText(currentSong.getInterpreter());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}