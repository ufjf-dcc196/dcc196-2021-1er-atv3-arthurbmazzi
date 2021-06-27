package com.example.atividade3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText firstNumber;
    private EditText secondNumber;
    private Double result1;
    private Double result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        result = findViewById(R.id.result);
    }

    public void Somar(View view)
    {
        result1 = Double.parseDouble(firstNumber.getText().toString());
        result2 = Double.parseDouble(secondNumber.getText().toString());

        Double addResult = result1 + result2;
        result.setText(addResult.toString());
    }

    public void Subtrair(View view)
    {
        result1 = Double.parseDouble(firstNumber.getText().toString());
        result2 = Double.parseDouble(secondNumber.getText().toString());

        Double subResult = result1 - result2;
        result.setText(subResult.toString());
    }

    public void Dividir(View view)
    {
        result1 = Double.parseDouble(firstNumber.getText().toString());
        result2 = Double.parseDouble(secondNumber.getText().toString());

        Double divResult = result1 / result2;
        result.setText(divResult.toString());
    }

    public void Multiplicar(View view)
    {
        result1 = Double.parseDouble(firstNumber.getText().toString());
        result2 = Double.parseDouble(secondNumber.getText().toString());

        Double multResult = result1 * result2;
        result.setText(multResult.toString());
    }
}