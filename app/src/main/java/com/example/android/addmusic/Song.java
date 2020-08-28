package com.example.android.addmusic;

/**
 * {@link Song} represents a song that the user wants to listen.
 * It contains the name of the song, the interpreter, the url for the youtube video clip and an image for that word.
 */
public class Song {

        /** Name of the song */
    private String mName;

    /** Singer or group that interpret the song*/
    private String mInterpreter;

    /**
     * Create a new Song object.
     *
     * @param name is the title of the song
     * @param interpreter is who interprets the song
     */
    public Song(String name, String interpreter) {
        mName = name;
        mInterpreter = interpreter;
    }

    /**
     * Get the name of the song.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the interpreter of the song.
     */
    public String getInterpreter() {
        return mInterpreter;
    }

}