package com.example.deepak.loginfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class feedback extends AppCompatActivity implements View.OnClickListener{


    Button yes,no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yes=(Button) findViewById(R.id.yes);
        Button no = (Button)findViewById(R.id.no);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {

            case R.id.yes:
                startActivity(new Intent(this,Welcome.class));
                break;

            case R.id.no:
                startActivity(new Intent(this,MusicPlayer.class));
                break;
        }

    }
}
