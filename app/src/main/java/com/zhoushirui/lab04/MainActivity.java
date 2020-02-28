package com.zhoushirui.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button first;
    Button second;
    Button third;
    Button fourth;
    Button fifth;
    Button sixth;
    Button seventh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.corners);
        second = findViewById(R.id.mid);
        third = findViewById(R.id.guide);
        fourth = findViewById(R.id.overlap);
        fifth = findViewById(R.id.scroll);
        sixth = findViewById(R.id.hscroll);
        seventh = findViewById(R.id.checkbox);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, CornerView.class);
                startActivity(myIntent);
            }
        });
        second.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, MiddleBoxes.class);
                startActivity(myIntent);
            }
        });
        third.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, Guideline.class);
                startActivity(myIntent);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, Overlap.class);
                startActivity(myIntent);
            }
        });
        fifth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, Scroll.class);
                startActivity(myIntent);
            }
        });
        sixth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, HScroll.class);
                startActivity(myIntent);
            }
        });
        seventh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, Checkbox.class);
                startActivity(myIntent);
            }
        });
    }
}