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

            family.add(new Word("father","әpә",R.drawable.family_father));
            family.add(new Word("mother","әṭa",R.drawable.family_mother));
            family.add(new Word("son","angsi",R.drawable.family_son));
            family.add(new Word("daughter","tune",R.drawable.family_daughter));
            family.add(new Word("older brother","taachi",R.drawable.family_older_brother));
            family.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
            family.add(new Word("older sister","tete",R.drawable.family_older_sister));
            family.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
            family.add(new Word("grandmother","ama",R.drawable.family_grandfather));
            family.add(new Word("grandfather","paapa",R.drawable.family_grandfather));

            WordAdapter familyadapter=new WordAdapter(this,family);
            ListView listView =findViewById(R.id.familylist);
            listView.setAdapter(familyadapter);

        }
    }

