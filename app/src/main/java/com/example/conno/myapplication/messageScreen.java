package com.example.conno.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class messageScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_screen);
    }

    public void setupAll(){
        //Matches Button setup
        ImageView homeBtn = (ImageView)findViewById(R.id.logoButton);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(messageScreen.this, SwipeScreen.class));
            }
        });


    }
}
