package com.example.conno.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onClick(View v){
        startActivity(new Intent(home.this, SwipeScreen.class));
    }
    public void setupAll() {
        ImageView logobtn = (ImageView) findViewById(R.id.logoView);

        logobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, SwipeScreen.class));
            }
        });

        TextView textbtn = (TextView) findViewById(R.id.peepsText);
        textbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(home.this, SwipeScreen.class));

            }
        });

        RelativeLayout bgbtn = (RelativeLayout) findViewById(R.id.background);

        bgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, SwipeScreen.class));
            }
        });


    }

}




