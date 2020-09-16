package com.example.hindivocal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers=findViewById(R.id.num);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent= new Intent(MainActivity.this,Number_Activity.class);
                startActivity(numberIntent);

            }
        });
        TextView fam=findViewById(R.id.fam);
       fam.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent familyIntent = new Intent(MainActivity.this, family_activity.class);
               startActivity(familyIntent);
           }
           });

       TextView col=findViewById(R.id.col);
       col.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               Intent colorIntent=new Intent(MainActivity.this,color_activity.class);
               startActivity(colorIntent);
           }
       });

    }
//    public  void open_numbers(View view)
//    {
//        // Explicit intent
//        Intent intent = new Intent(this,Number_Activity.class);
//        startActivity(intent);
//
//    }
}