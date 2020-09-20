package com.example.hindivocal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class family_activity extends AppCompatActivity{
MediaPlayer mediaPlayer;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.family_activity);
           final ArrayList<Word> family= new ArrayList<Word>();

            family.add(new Word("father","әpә",R.drawable.family_father,R.raw.family_father));
            family.add(new Word("mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
            family.add(new Word("son","angsi",R.drawable.family_son,R.raw.family_son));
            family.add(new Word("daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
            family.add(new Word("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
            family.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
            family.add(new Word("older sister","tete",R.drawable.family_older_sister,R.raw.family_older_sister));
            family.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
            family.add(new Word("grandmother","ama",R.drawable.family_grandfather,R.raw.family_grandmother));
            family.add(new Word("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

            WordAdapter familyadapter=new WordAdapter(this,family);
            ListView listView =findViewById(R.id.familylist);
            listView.setAdapter(familyadapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    //Toast.makeText(Number_Activity.this,"clicked",Toast.LENGTH_SHORT).show();
                    //mediaPlayer= MediaPlayer.create(Number_Activity.this,R.raw.number_one);
                    Word word=family.get(i);
                    mediaPlayer= MediaPlayer.create(family_activity.this,word.getmAudio_R_id());
                    mediaPlayer.start();
                }
            });

        }
    }

