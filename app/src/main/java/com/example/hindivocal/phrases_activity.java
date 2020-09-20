package com.example.hindivocal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class phrases_activity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrases_activity);
       final ArrayList<Word> phrases= new ArrayList<Word>();
        phrases.add(new Word("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        phrases.add(new Word("What is your name?","tinnә oyaasenә",R.raw.phrase_what_is_your_name));
        phrases.add(new Word("My name is ..","oyaaset ...",R.raw.phrase_my_name_is));
        phrases.add(new Word("How are you feeling","michәksәs?",R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word("I'am feeling good ","kuchi achit",R.raw.phrase_im_feeling_good));
        phrases.add(new Word("Are you comming","әәnәs'aa?",R.raw.phrase_are_you_coming));
        phrases.add(new Word("Yes i'am comming","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        phrases.add(new Word("I'am coming","әәnәm",R.raw.phrase_im_coming));
        phrases.add(new Word("Let's go","yoowutis",R.raw.phrase_lets_go));
        phrases.add(new Word("come here","anni'nem",R.raw.phrase_come_here));

        WordAdapter adapter=new WordAdapter(this,phrases);
        ListView listView =findViewById(R.id.phraseslist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(Number_Activity.this,"clicked",Toast.LENGTH_SHORT).show();
                //mediaPlayer= MediaPlayer.create(Number_Activity.this,R.raw.number_one);
                Word word=phrases.get(i);
                mediaPlayer= MediaPlayer.create(phrases_activity.this,word.getmAudio_R_id());
                mediaPlayer.start();
            }
        });

    }
}
