package com.example.deepak.loginfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Takeinput extends AppCompatActivity  implements View.OnClickListener{

    Button bshowlevel;
    EditText etBP,etHR,etPR,etBT;
    TextView twlevel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeinput);

        etBP= (EditText) findViewById(R.id.etBP);
        etBT=(EditText) findViewById(R.id.etBT);
        etHR=(EditText)findViewById(R.id.etHR);
        etPR=(EditText)findViewById(R.id.etPR);
        bshowlevel=(Button)findViewById(R.id.bshowlevel);

        bshowlevel.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

            switch(view.getId())
            {
                case R.id.bshowlevel:


                    break;
            }
    }
}
