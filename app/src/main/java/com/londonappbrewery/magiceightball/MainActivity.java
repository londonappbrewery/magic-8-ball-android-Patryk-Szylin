package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView m_ballDisplay = findViewById(R.id.m_image_eightBall);
        Button m_askButton = findViewById(R.id.m_askButton);

        final int[] m_ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        m_askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rng = new Random();

                int randomIndex = rng.nextInt(5);
                m_ballDisplay.setImageResource(m_ballArray[randomIndex]);
            }
        });



    }
}
