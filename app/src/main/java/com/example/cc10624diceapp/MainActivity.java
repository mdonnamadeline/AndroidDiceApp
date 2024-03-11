package com.example.cc10624diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnRoll, btnReset, btnClose;

    private Button btnSixSide, btnEightSide, btnTwelveSide;
    private ImageView imgDice;
    int selected = 1;
    int sides = 6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind the buttons & image view from the layout view
        btnRoll = (Button) findViewById(R.id.btnRoll);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnClose = (Button) findViewById(R.id.btnClose);
        btnSixSide = (Button) findViewById(R.id.btnSidedSix);
        btnEightSide = (Button) findViewById(R.id.btnEightSide);
        btnTwelveSide = (Button) findViewById(R.id.btnSidedTwelve);
        imgDice = (ImageView) findViewById(R.id.imgDice);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                imgDice.setImageResource(R.drawable.cleverbaby);
            }
        });

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                showDice();
            }
        });

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDice();
            }
        });

        btnSixSide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected = 1;
                imgDice.setImageResource(R.drawable.cleverbaby);
            }
        });

        btnEightSide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected = 2;
                imgDice.setImageResource(R.drawable.polyhedral);
            }
        });

        btnTwelveSide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected = 3;
                imgDice.setImageResource(R.drawable.maintwelve);

            }
        });


    }
    public void showDice() {
        Random rnd = new Random();

        switch(selected) {
            case 1: sides = 6; break;
            case 2: sides = 8; break;
            case 3: sides = 12; break;

        }


        int randomNum = rnd.nextInt(sides)+1;
        if(selected == 1) {
            switch(randomNum) {
                case 1: imgDice.setImageResource(R.drawable.sixsided_one); break;
                case 2: imgDice.setImageResource(R.drawable.sixsided_two); break;
                case 3: imgDice.setImageResource(R.drawable.sixsided_three); break;
                case 4: imgDice.setImageResource(R.drawable.sixsided_four); break;
                case 5: imgDice.setImageResource(R.drawable.sixsided_five); break;
                case 6: imgDice.setImageResource(R.drawable.sixsided_six); break;
            }
        } else if (selected == 2) {
            switch(randomNum) {
                case 1: imgDice.setImageResource(R.drawable.eightsided_one); break;
                case 2: imgDice.setImageResource(R.drawable.eightsided_two); break;
                case 3: imgDice.setImageResource(R.drawable.eightsided_three); break;
                case 4: imgDice.setImageResource(R.drawable.eightsided_four); break;
                case 5: imgDice.setImageResource(R.drawable.eightsided_five); break;
                case 6: imgDice.setImageResource(R.drawable.eightsided_six); break;
                case 7: imgDice.setImageResource(R.drawable.eightsided_seven); break;
                case 8: imgDice.setImageResource(R.drawable.eightsided_eight); break;
            }
        } else if (selected == 3) {
            switch(randomNum) {
                case 1: imgDice.setImageResource(R.drawable.one); break;
                case 2: imgDice.setImageResource(R.drawable.two); break;
                case 3: imgDice.setImageResource(R.drawable.three); break;
                case 4: imgDice.setImageResource(R.drawable.four); break;
                case 5: imgDice.setImageResource(R.drawable.five); break;
                case 6: imgDice.setImageResource(R.drawable.six); break;
                case 7: imgDice.setImageResource(R.drawable.seven); break;
                case 8: imgDice.setImageResource(R.drawable.eight); break;
                case 9: imgDice.setImageResource(R.drawable.nine); break;
                case 10: imgDice.setImageResource(R.drawable.ten); break;
                case 11: imgDice.setImageResource(R.drawable.eleven); break;
                case 12: imgDice.setImageResource(R.drawable.twelve); break;
            }
        }


    }
}

