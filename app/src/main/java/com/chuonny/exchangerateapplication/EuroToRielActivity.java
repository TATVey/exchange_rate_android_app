package com.chuonny.exchangerateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EuroToRielActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro_to_riel);

        Button btnExchange = findViewById(R.id.btnExchange);
        btnExchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextAmount = findViewById(R.id.editTextAmount);
                TextView textViewResult = findViewById(R.id.textViewResult);

                //100riels = 0.021Euro
                double exchange = Double.parseDouble(editTextAmount.getText().toString()) * 100 / 0.021;
                textViewResult.setText(exchange + "");
            }
        });
    }
}