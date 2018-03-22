package com.example.conno.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void setupAll(){
        //Matches Button setup
        ImageView homeBtn1 = (ImageView)findViewById(R.id.swipeButton);
        homeBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(settings.this,SwipeScreen.class));
            }
        });


    }
}
