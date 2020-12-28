package com.molfar.gardeningcalendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.molfar.gardeningcalendar.month.AprilActivity;
import com.molfar.gardeningcalendar.month.AugustActivity3;
import com.molfar.gardeningcalendar.month.DecemberActivity3;
import com.molfar.gardeningcalendar.month.FebruaryActivity;
import com.molfar.gardeningcalendar.month.JenuaryActivity;
import com.molfar.gardeningcalendar.month.JulyActivity3;
import com.molfar.gardeningcalendar.month.JuneActivity3;
import com.molfar.gardeningcalendar.month.MarchActivity;
import com.molfar.gardeningcalendar.month.MayActivity3;
import com.molfar.gardeningcalendar.month.NovemberActivity3;
import com.molfar.gardeningcalendar.month.OctoberActivity3;
import com.molfar.gardeningcalendar.month.SeptemberActivity3;

public class MainActivity2 extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mainGrid = (GridLayout) findViewById(R.id.main_grid);

        //setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
        setIntentEvent(mainGrid);
    }

    private void setIntentEvent(GridLayout mainGrid) {
        for (int i=0; i<mainGrid.getChildCount() ;i++ )
        {
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i+1;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    /*Intent intent = new Intent(MainActivity2.this, JenuaryActivity.class);
                    startActivity(intent);*/


                    if  (finalI==1)
                    {
                        Intent intent = new Intent(MainActivity2.this, MarchActivity.class);
                        startActivity(intent);
                    }
                    else if  (finalI==2)
                    {
                        Intent intent = new Intent(MainActivity2.this, AprilActivity.class);
                        startActivity(intent);
                    }
                    else if  (finalI==3)
                    {
                        Intent intent = new Intent(MainActivity2.this, MayActivity3.class);
                        startActivity(intent);
                    }
                    else if  (finalI==4)
                    {
                        Intent intent = new Intent(MainActivity2.this, JuneActivity3.class);
                        startActivity(intent);
                    }
                    else if  (finalI==5)
                    {
                        Intent intent = new Intent(MainActivity2.this, JulyActivity3.class);
                        startActivity(intent);
                    }
                    else if  (finalI==6)
                    {
                        Intent intent = new Intent(MainActivity2.this, AugustActivity3.class);
                        startActivity(intent);
                    }
                    else if  (finalI==7)
                    {
                        Intent intent = new Intent(MainActivity2.this, SeptemberActivity3.class);
                        startActivity(intent);
                    }
                    else if  (finalI==8)
                    {
                        Intent intent = new Intent(MainActivity2.this, OctoberActivity3.class);
                        startActivity(intent);
                    }
                    else if  (finalI==9)
                    {
                        Intent intent = new Intent(MainActivity2.this, NovemberActivity3.class);
                        startActivity(intent);
                    }
                    else if  (finalI==10)
                    {
                        Intent intent = new Intent(MainActivity2.this, DecemberActivity3.class);
                        startActivity(intent);
                    }
                    else if (finalI==11)
                    {
                        Intent intent = new Intent(MainActivity2.this, JenuaryActivity.class);
                        startActivity(intent);
                    }
                    else if  (finalI==12)
                    {
                        Intent intent = new Intent(MainActivity2.this, FebruaryActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }

    private void setToggleEvent(GridLayout mainGrid) {
        for (int i=0; i<mainGrid.getChildCount() ;i++ )
        {
            final CardView cardView = (CardView) mainGrid.getChildAt(i);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1)
                    {
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                    }
                    else
                    {
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    }
                }
            });
        }


    }

    private void setSingleEvent(GridLayout mainGrid) {

        for (int i=0; i<mainGrid.getChildCount() ;i++ )
        {
            CardView cardView = (CardView) mainGrid.getChildAt(i);

            final int finalI = i+1;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity2.this, "Ви обрали " + finalI, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}