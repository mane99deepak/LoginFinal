package com.example.deepak.loginfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;


public class Registered extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);


        DatabaseHandler db = new DatabaseHandler(getApplicationContext());

        HashMap<String, String> user = new HashMap<String, String>();
        user = db.getUserDetails();

        /**
         * Displays the registration details in Text view
         **/

        final TextView fname = (TextView) findViewById(R.id.fname);
        final TextView lname = (TextView) findViewById(R.id.lname);
        final TextView uname = (TextView) findViewById(R.id.uname);
        final TextView email = (TextView) findViewById(R.id.email);
        final TextView created_at = (TextView) findViewById(R.id.regat);
        fname.setText(user.get("fname"));
        lname.setText(user.get("lname"));
        uname.setText(user.get("uname"));
        email.setText(user.get("email"));
        created_at.setText(user.get("created_at"));


        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Login.class);
                startActivityForResult(myIntent, 0);
                finish();
            }

        });


    }
}

