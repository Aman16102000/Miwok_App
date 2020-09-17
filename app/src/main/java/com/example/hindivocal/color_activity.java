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

        color.add(new Word("Red","weṭeṭṭi",R.drawable.color_red));
        color.add(new Word("green","chokokki",R.drawable.color_green));
        color.add(new Word("brown","ṭakaakki",R.drawable.color_brown));
        color.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        color.add(new Word("black","kululli",R.drawable.color_black));
        color.add(new Word("white","kelelli",R.drawable.color_white));
        color.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        color.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter adaptercolor=new WordAdapter(this,color);
        ListView listView =findViewById(R.id.colorlist);
        listView.setAdapter(adaptercolor);

    }
}
