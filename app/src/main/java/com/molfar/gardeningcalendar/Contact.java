package com.molfar.gardeningcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Contact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView text2 = (TextView) findViewById(R.id.tv_line4);
        TextView text3 = (TextView) findViewById(R.id.tv_line5);
        TextView text4 = (TextView) findViewById(R.id.tv_line6);
        TextView text5 = (TextView) findViewById(R.id.tv_line7);

        text2.setMovementMethod(LinkMovementMethod.getInstance());
        text3.setMovementMethod(LinkMovementMethod.getInstance());
        text4.setMovementMethod(LinkMovementMethod.getInstance());
        text5.setMovementMethod(LinkMovementMethod.getInstance());



    }
}