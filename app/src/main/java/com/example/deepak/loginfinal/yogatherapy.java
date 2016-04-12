package com.example.deepak.loginfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class yogatherapy extends AppCompatActivity {


    private static final String TAG = yogatherapy.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "ONCREATE");

        setContentView(R.layout.activity_yogatherapy);
        final ImageSwitcher sw;
        final ImageView imageView = (ImageView) findViewById(R.id.dhanurasan);
        final Button changebutton = (Button) findViewById(R.id.changebutton);
        final Button prevbutton = (Button) findViewById(R.id.prevbutton);
        changebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.paschi);
                changebutton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        imageView.setImageResource(R.drawable.adho_mukha);
                        changebutton.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                imageView.setImageResource(R.drawable.cat);
                                changebutton.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        imageView.setImageResource(R.drawable.fish_pose);
                                        changebutton.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {
                                                imageView.setImageResource(R.drawable.padhstasn);
                                                changebutton.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {
                                                        imageView.setImageResource(R.drawable.setub);
                                                        changebutton.setOnClickListener(new View.OnClickListener() {

                                                            @Override
                                                            public void onClick(View v) {
                                                                imageView.setImageResource(R.drawable.shirsasana);
                                                                changebutton.setOnClickListener(new View.OnClickListener() {

                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        imageView.setImageResource(R.drawable.shirsasana);
                                                                        changebutton.setOnClickListener(new View.OnClickListener() {

                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                imageView.setImageResource(R.drawable.shavasan);
                                                                            }
                                                                        });


                                                                    }


                                                                });


                                                            }


                                                        });


                                                    }

                                                });


                                            }


                                        });


                                    }

                                });


                            }


                        });

                    }


                });

            }


        });


    }
}