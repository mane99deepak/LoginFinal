package com.example.deepak.loginfinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class Call extends AppCompatActivity {

Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        Button startBtn = (Button) findViewById(R.id.makeCall);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                makeCall();


                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
                fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }


                });
            }


            private void setSupportActionBar(Toolbar toolbar) {

            }

            protected void makeCall() {
                Log.i("Make call", "");

                Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                phoneIntent.setData(Uri.parse("tel:1234567890"));

                try {
                    startActivity(phoneIntent);
                    finish();
                    Log.i("Finished making a call...", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    android.widget.Toast.makeText(Call.this, "Call faild,try later.", android.widget.Toast.LENGTH_LONG).show();
                }

            }
        });




    }
}




