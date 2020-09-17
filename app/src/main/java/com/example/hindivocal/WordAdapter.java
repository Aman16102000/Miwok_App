package com.example.hindivocal;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words)
    {
        super(context,0,words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord=getItem(position);
        TextView MiwokTextView  =(TextView)listItemView.findViewById(R.id.miwok_t_v);
        MiwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView=(TextView)listItemView.findViewById(R.id.number_t_v);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView defaultImageView = listItemView.findViewById(R.id.image_t_v);

        if(currentWord.hasImage())
        {
            defaultImageView.setImageResource(currentWord.getResource_drawable_id());
        }
        else
        {
            defaultImageView.setVisibility(View.GONE);
        }
        return listItemView;
    }




}
