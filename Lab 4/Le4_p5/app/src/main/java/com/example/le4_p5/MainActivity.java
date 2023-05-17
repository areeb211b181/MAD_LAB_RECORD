package com.example.le4_p5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView i =findViewById(R.id.imageView);
       i.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               i.setImageResource(R.drawable.modi);
               i.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       i.setImageResource(R.drawable.donald_trump);
                   }
               });
           }
       });
    }
}