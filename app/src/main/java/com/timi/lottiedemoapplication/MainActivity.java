package com.timi.lottiedemoapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LottieAnimationView animationView =  findViewById(R.id.lottie_main);
        // ÉèÖÃjsonÎÄ¼þ
        animationView.setAnimation(R.raw.twitterheart);
        new LottieUtils(true).loadJsonAnimation(animationView,R.raw.empty_state);
    }
}
