package com.example.conno.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SwipeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_screen);
    }

    public void onClickMessageButton(View v){
        startActivity(new Intent(SwipeScreen.this, messageScreen.class));
    }

    public void setupAll(){
        //Matches Button setup
        /*ImageView matchBtn = (ImageView)findViewById(R.id.messageButton);
        matchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SwipeScreen.this, messageScreen.class));
            }
        });*/

        //Profile/Settings button setup
        ImageView profileBtn = (ImageView)findViewById(R.id.editButton);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SwipeScreen.this, settings.class));
            }
        });
    }
}
