package com.natallia.radaman.customviewsmile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SmileFaceView sadButton;
    SmileFaceView happyButton;
    SmileFaceView smileFaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sadButton = findViewById(R.id.sadButton);
        happyButton = findViewById(R.id.happyButton);
        smileFaceView = findViewById(R.id.smileFaceView);
        sadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smileFaceView.setHappinessState(SmileFaceView.SAD);
            }
        });
        happyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smileFaceView.setHappinessState(SmileFaceView.HAPPY);
            }
        });
    }
}
