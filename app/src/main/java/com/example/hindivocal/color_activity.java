package com.example.hindivocal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class color_activity extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_activity);

       final ArrayList<Word> color= new ArrayList<Word>();

        color.add(new Word("Red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        color.add(new Word("green","chokokki",R.drawable.color_green,R.raw.color_green));
        color.add(new Word("brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        color.add(new Word("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        color.add(new Word("black","kululli",R.drawable.color_black,R.raw.color_black));
        color.add(new Word("white","kelelli",R.drawable.color_white,R.raw.color_white));
        color.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        color.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        WordAdapter adaptercolor=new WordAdapter(this,color);
        ListView listView =findViewById(R.id.colorlist);
        listView.setAdapter(adaptercolor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(Number_Activity.this,"clicked",Toast.LENGTH_SHORT).show();
                //mediaPlayer= MediaPlayer.create(Number_Activity.this,R.raw.number_one);
                Word word=color.get(i);
                mediaPlayer= MediaPlayer.create(color_activity.this,word.getmAudio_R_id());
                mediaPlayer.start();
            }
        });
    }
}
