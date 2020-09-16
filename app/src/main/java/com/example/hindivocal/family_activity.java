package com.example.hindivocal;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class family_activity extends AppCompatActivity{


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.family_activity);
            ArrayList<Word> family= new ArrayList<Word>();

            family.add(new Word("father","әpә"));
            family.add(new Word("mother","әṭa"));
            family.add(new Word("son","angsi"));
            family.add(new Word("daughter","tune"));
            family.add(new Word("older brother","taachi"));
            family.add(new Word("younger brother","chalitti"));
            family.add(new Word("older sister","tete"));
            family.add(new Word("younger sister","kolliti"));
            family.add(new Word("grandmother","ama"));
            family.add(new Word("grandfather","paapa"));

            WordAdapter familyadapter=new WordAdapter(this,family);
            ListView listView =findViewById(R.id.familylist);
            listView.setAdapter(familyadapter);

        }
    }

