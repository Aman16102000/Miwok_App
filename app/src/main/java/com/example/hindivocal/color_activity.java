package com.example.hindivocal;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class color_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_activity);

        ArrayList<Word> color= new ArrayList<Word>();

        color.add(new Word("Red","weṭeṭṭi"));
        color.add(new Word("green","chokokki"));
        color.add(new Word("brown","ṭakaakki"));
        color.add(new Word("gray","ṭopoppi"));
        color.add(new Word("black","kululli"));
        color.add(new Word("white","kelelli"));
        color.add(new Word("dusty yellow","ṭopiisә"));
        color.add(new Word("mustard yellow","chiwiiṭә"));

        WordAdapter adaptercolor=new WordAdapter(this,color);
        ListView listView =findViewById(R.id.colorlist);
        listView.setAdapter(adaptercolor);

    }
}
