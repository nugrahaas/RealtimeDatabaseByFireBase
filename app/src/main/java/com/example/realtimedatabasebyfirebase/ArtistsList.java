package com.example.realtimedatabasebyfirebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ArtistsList extends ArrayAdapter<Artists> {
    private Activity context;
    List<Artists> artistsList;

    public ArtistsList(Activity context, List<Artists> artistsList){
        super(context, R.layout.list_layout, artistsList);

        this.context = context;
        this.artistsList = artistsList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textViewName = listViewItem.findViewById(R.id.textViewName);
        TextView textViewGenre = listViewItem.findViewById(R.id.textViewGenre);

        Artists artists = artistsList.get(position);

        textViewName.setText(artists.getArtistName());
        textViewGenre.setText(artists.getArtistGenre());


        return listViewItem;
    }
}
