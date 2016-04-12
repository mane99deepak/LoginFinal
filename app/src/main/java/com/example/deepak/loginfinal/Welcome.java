package com.example.deepak.loginfinal;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity implements View.OnClickListener {


    Button connecttodevice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
           connecttodevice=(Button) findViewById(R.id.connecttodevice);

        connecttodevice.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
           case R.id.connecttodevice :

               startActivity(new Intent(Settings.ACTION_BLUETOOTH_SETTINGS));
                break;
        }
        }

    }

