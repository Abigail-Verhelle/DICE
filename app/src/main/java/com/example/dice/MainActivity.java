package com.example.dice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    /*private static String TextView = "";
    private static String TextView2 = "";*/
    private static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();

            }

        },SPLASH_TIME_OUT);

        imageViewdice = findViewById(R.id.image_view_dice);
        imageViewdice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolldice();
            }
        });
    }

    private ImageView imageViewdice;
    private Random rng = new Random();
    private void rolldice(){
        int randomNumber =  rng.nextInt( 20) + 1;

        switch(randomNumber){


            case 1:
                imageViewdice.setImageResource(R.drawable.smile1);
                /*TextView.setVisibility(View.VISIBLE);*/
                break;

            case 2:
                imageViewdice.setImageResource(R.drawable.smile2);
                break;

            case 3:
                imageViewdice.setImageResource(R.drawable.smile3);
                break;

            case 4:
                imageViewdice.setImageResource(R.drawable.smile4);
                break;

            case 5:
                imageViewdice.setImageResource(R.drawable.smile5);
                break;

            case 6:
                imageViewdice.setImageResource(R.drawable.smile6);
                break;

            case 7:
                imageViewdice.setImageResource(R.drawable.smile7);
                break;

            case 8:
                imageViewdice.setImageResource(R.drawable.smile8);
                break;

            case 9:
                imageViewdice.setImageResource(R.drawable.smile9);
                break;

            case 10:
                imageViewdice.setImageResource(R.drawable.smile10);
                break;

            case 11:
                imageViewdice.setImageResource(R.drawable.smile11);
                break;

            case 12:
                imageViewdice.setImageResource(R.drawable.smile12);
                break;

            case 13:
                imageViewdice.setImageResource(R.drawable.smile13);
                break;

            case 14:
                imageViewdice.setImageResource(R.drawable.smile14);
                break;

            case 15:
                imageViewdice.setImageResource(R.drawable.smile15);
                break;

            case 16:
                imageViewdice.setImageResource(R.drawable.smile16);
                break;

            case 17:
                imageViewdice.setImageResource(R.drawable.smile17);
                break;

            case 18:
                imageViewdice.setImageResource(R.drawable.smile18);
                break;

            case 19:
                imageViewdice.setImageResource(R.drawable.smile19);
                break;

            case 20:
                imageViewdice.setImageResource(R.drawable.smile20);
                /* TextView2.setVisibility(View.VISIBLE);*/
                break;


        }
    }
}
