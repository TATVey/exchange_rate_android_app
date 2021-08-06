package com.chuonny.exchangerateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRielToUsd = findViewById(R.id.btnRielToUsd);
        btnRielToUsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RielToUSDActivity.class);
                startActivity(intent);
            }
        });

        Button btnUsdToRiel = findViewById(R.id.btnUsdToRiel);
        btnUsdToRiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), UsdToRielActivity.class);
                startActivity(intent);
            }
        });
        Button btnRielToEuro = findViewById(R.id.btnRielToEuro);
        btnRielToEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RielToEuroActivity.class);
                startActivity(intent);
            }
        });

        Button btnEuroToRiel = findViewById(R.id.btnEuroToRiel);
        btnEuroToRiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EuroToRielActivity.class);
                startActivity(intent);
            }
        });






    }
}