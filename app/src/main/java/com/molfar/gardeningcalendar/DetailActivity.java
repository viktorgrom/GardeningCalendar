package com.molfar.gardeningcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailActivity extends AppCompatActivity {

    private TextView tv_title, tv_description;
    private ImageView img_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DetailActivity.this, Contact.class);
                startActivity(intent);
            }
        });



        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_description = (TextView) findViewById(R.id.tv_descriptions);
        img_type = (ImageView) findViewById(R.id.img_type);

        Intent intent = getIntent();
        String title = intent.getExtras().getString("title");
        String description = intent.getExtras().getString("description");
        int image = intent.getExtras().getInt("Type_work");

        tv_title.setText(title);
        tv_description.setText(description);
        img_type.setImageResource(image);
    }
}