package com.example.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cursoandroid.Calculadora.CalculadoraActivity;
import com.example.cursoandroid.RegUser.RegistroActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnRegistro = findViewById(R.id.btnRegistro);
        Button btnCalculadora = findViewById(R.id.btnCalculadora);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToBtnRegistro();
            }
        });

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCalculadoraActivity();
            }
        });
    }

    private void navigateToBtnRegistro() {
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    private void navigateToCalculadoraActivity() {
        Intent intent = new Intent(this, CalculadoraActivity.class);
        startActivity(intent);
    }
}

