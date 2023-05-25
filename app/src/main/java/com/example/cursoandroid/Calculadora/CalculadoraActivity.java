package com.example.cursoandroid.Calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cursoandroid.R;

public class CalculadoraActivity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2;
    private Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        textViewResult = findViewById(R.id.textViewResult);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation(Operation.ADD);
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation(Operation.SUBTRACT);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation(Operation.MULTIPLY);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation(Operation.DIVIDE);
            }
        });
    }

    private void performOperation(Operation operation) {
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());

        int result = 0;

        switch (operation) {
            case ADD:
                result = number1 + number2;
                break;
            case SUBTRACT:
                result = number1 - number2;
                break;
            case MULTIPLY:
                result = number1 * number2;
                break;
            case DIVIDE:
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    textViewResult.setText("Error: División entre cero");
                    return;
                }
                break;
        }

        textViewResult.setText("Resultado: " + result);
    }

    private enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
}