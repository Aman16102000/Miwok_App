package com.example.hindivocal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Number_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_);

LinearLayout rootView=findViewById(R.id.number);
        ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("One","lutti"));
        words.add(new Word("Two","otiiko"));
        words.add(new Word("Three","tolookosu"));
        words.add(new Word("Four","oyyisa"));
        words.add(new Word("Five","massoka"));
        words.add(new Word("Six","temmoka"));
        words.add(new Word("Seven","kenekaku"));
        words.add(new Word("Eight","kawinta"));
        words.add(new Word("Nine","wo'e"));
        words.add(new Word("Ten","na'aacha"));

        WordAdapter adapter=new WordAdapter(this,words);
        ListView listView =findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}