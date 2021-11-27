package com.example.timer;

// Layout code not needed as layout for this application can be anything
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    int number =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(35000, 1000){
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("lpg", "onTick: checking background task");

            }

            @Override
            public void onFinish() {
                Log.d("lpg", "finally finished");

            }
        }.start();







    }
}

