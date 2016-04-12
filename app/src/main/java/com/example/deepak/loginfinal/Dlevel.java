package com.example.deepak.loginfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dlevel extends AppCompatActivity implements View.OnClickListener{

    Button ChillMusic,Yoga,RockMusic,Ragas;
    TextView twlevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dlevel);

        ChillMusic=(Button)findViewById(R.id.chillmusic);
        Yoga=(Button)findViewById(R.id.yoga);
        RockMusic=(Button)findViewById(R.id.rockmusic);
        Ragas=(Button)findViewById(R.id.ragas);

        ChillMusic.setOnClickListener(this);
        Yoga.setOnClickListener(this);
        RockMusic.setOnClickListener(this);
        Ragas.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.chillmusic:
                startActivity(new Intent(this,MusicPlayer.class));
                break;

            case R.id.rockmusic:
                startActivity(new Intent(this,MusicPlayer1.class));
                break;

            case R.id.ragas:
                startActivity(new Intent(this,MusicPlayer2.class));
                break;

            case R.id.yoga:
                startActivity(new Intent(this,yogatherapy.class));
                break;
        }


    }
}
