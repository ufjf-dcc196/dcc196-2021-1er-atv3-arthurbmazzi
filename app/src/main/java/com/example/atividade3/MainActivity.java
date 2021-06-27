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
        try {
            result1 = Double.parseDouble(firstNumber.getText().toString());
            result2 = Double.parseDouble(secondNumber.getText().toString());

            Double addResult = result1 + result2;
            result.setText(addResult.toString());
        }
        catch (Exception e)
        {
            String errorMessage = "Try Again";
            result.setText(errorMessage);
        }
    }

    public void Subtrair(View view)
    {
        try {
            result1 = Double.parseDouble(firstNumber.getText().toString());
            result2 = Double.parseDouble(secondNumber.getText().toString());

            Double subResult = result1 - result2;
            result.setText(subResult.toString());
        }
        catch (Exception e)
        {
            String errorMessage = "Try Again";
            result.setText(errorMessage);
        }
    }

    public void Dividir(View view)
    {
        try {
            result1 = Double.parseDouble(firstNumber.getText().toString());
            result2 = Double.parseDouble(secondNumber.getText().toString());

            if(result2 == 0)
                throw new Exception();

            Double divResult = result1 / result2;
            result.setText(divResult.toString());
        }
        catch (Exception e)
        {
            String errorMessage = "Try Again";
            result.setText(errorMessage);
        }
    }

    public void Multiplicar(View view) {
        try {
            result1 = Double.parseDouble(firstNumber.getText().toString());
            result2 = Double.parseDouble(secondNumber.getText().toString());

        Double multResult = result1 * result2;
        result.setText(multResult.toString());
        }
        catch (Exception e)
        {
            String errorMessage = "Try Again";
            result.setText(errorMessage);
        }
    }
}