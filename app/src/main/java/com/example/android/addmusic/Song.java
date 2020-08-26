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

    /** Url for the youtube official video*/
    private String mUrl;

    /** Image resource ID for the album of the song */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Song object.
     *
     * @param name is the title of the song
     * @param interpreter is who interprets the song
     * @param url is the location of the song video*
     */
    public Song(String name, String interpreter, String url) {
        mName = name;
        mInterpreter = interpreter;
        mUrl = url;
    }

    /**
     * Create a new Song object.
     *
     * @param name is the title of the song
     * @param interpreter is who interprets the song
     * @param url is the location of the song video*
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Song(String name, String interpreter, String url, int imageResourceId) {
        mName = name;
        mInterpreter = interpreter;
        mUrl = url;
        mImageResourceId = imageResourceId;
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

    /**
     * Get the url of the song.
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Return the image resource ID of the song album.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}