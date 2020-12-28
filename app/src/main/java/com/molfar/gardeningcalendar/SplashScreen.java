package com.molfar.gardeningcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_splash_screen);

        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity2.class)
                .withSplashTimeOut(4000)
                .withLogo(R.drawable.soroka_logo_mini)
                .withBackgroundResource(R.drawable.background_start2)
                //.withBackgroundColor(Color.parseColor("#074E72"))
                .withHeaderText("Студія розробки MOLFAR презентує")
                .withFooterText("Copyright MOLFAR 2020")
                .withAfterLogoText("за сприяння Alexei Soroka")
                .withBeforeLogoText("Календар Садівника");


        config.getHeaderTextView().setTextColor(0xFFF0932B);
        config.getBeforeLogoTextView().setTextSize(30);
        config.getFooterTextView().setTextColor(0xFFF0932B);
        config.getBeforeLogoTextView().setTextColor(0xFFF0932B);
        config.getAfterLogoTextView().setTextColor(0xFFF0932B);

        //set to view
        View view = config.create();

        setContentView(view);
    }
}