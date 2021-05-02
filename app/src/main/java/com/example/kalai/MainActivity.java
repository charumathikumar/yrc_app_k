package com.example.kalai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CardView markcardview;
    private CardView showcardview;
    private CardView eventcardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        markcardview = (CardView) findViewById(R.id.markcardview);
        showcardview = (CardView) findViewById(R.id.showcardview);
        eventcardview = (CardView) findViewById(R.id.eventcardview);

        eventcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "EVENT PAGE", Toast.LENGTH_SHORT).show();
            }
        });
        markcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "MARK ATTENDANCE PAGE", Toast.LENGTH_SHORT).show();
            }
        });
        showcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "SHOW ATTENDANCE PAGE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}