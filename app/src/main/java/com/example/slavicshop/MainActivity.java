package com.example.slavicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton MyImageButton;
    ImageButton MyImageButton1;
    ImageButton MyImageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyImageButton = (ImageButton) findViewById(R.id.my_image_button);

        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intentLoadNewActivity);
            }
        });

        MyImageButton1 = (ImageButton) findViewById(R.id.my_image_button1);

        MyImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intentLoadNewActivity);
            }
        });

        MyImageButton2 = (ImageButton) findViewById(R.id.my_image_button2);

        MyImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}