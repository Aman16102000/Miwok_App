package com.example.hindivocal;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class phrases_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrases_activity);
        ArrayList<Word> phrases= new ArrayList<Word>();
        phrases.add(new Word("Where are you going?","minto wuksus"));
        phrases.add(new Word("What is your name?","tinnә oyaasenә"));
        phrases.add(new Word("My name is ..","oyaaset ..."));
        phrases.add(new Word("How are you feeling","michәksәs?"));
        phrases.add(new Word("I'am feeling good ","kuchi achit"));
        phrases.add(new Word("Are you comming","әәnәs'aa?"));
        phrases.add(new Word("Yes i'am comming","hәә’ әәnәm"));
        phrases.add(new Word("I'am comming","әәnәm"));
        phrases.add(new Word("Let's go","yoowutis"));
        phrases.add(new Word("come here","anni'nem"));

        WordAdapter adapter=new WordAdapter(this,phrases);
        ListView listView =findViewById(R.id.phraseslist);
        listView.setAdapter(adapter);

    }
}
