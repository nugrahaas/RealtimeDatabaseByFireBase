package com.example.realtimedatabasebyfirebase;

public class Artists {

    String artistID;
    String artistName;
    String artistGenre;

    public Artists(){

    }

    public Artists(String artistID, String artistName, String artistGenre) {
        this.artistID = artistID;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public String getArtistID() {
        return artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }
}
