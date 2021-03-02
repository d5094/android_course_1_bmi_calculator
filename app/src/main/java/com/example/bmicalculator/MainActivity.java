package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtWeight;
    EditText txtHeight;
    TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtWeight = findViewById(R.id.txtWeight);
        txtHeight = findViewById(R.id.txtHeight);
        tvInfo = findViewById(R.id.tvInfo);
    }

    public void calculateBMI(View view) {
        float weight = Float.parseFloat(txtWeight.getText().toString());
        float height = Float.parseFloat(txtHeight.getText().toString()) / 100;

        float bmi = weight / (height * height);

        String info = "BMI = " + bmi + ", ";

        if(bmi < 18.5) {
            info += "You are underweight!";
        } else if(bmi > 25) {
            info += "You are overweight!";
        } else {
            info += "You have a normal weight.";
        }

        tvInfo.setText(info);
    }
}