package com.chuonny.exchangerateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UsdToRielActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usd_to_riel);

        Button btnExchange = findViewById(R.id.btnExchange);
        btnExchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextAmount = findViewById(R.id.editTextAmount);
                TextView textViewResult = findViewById(R.id.textViewResult);

                //4000Riels = 1USD
                double exchange = Double.parseDouble(editTextAmount.getText().toString()) * 4000;
                textViewResult.setText(exchange + "");
            }
        });
    }
}