package com.example.cursoandroid.RegUser;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.cursoandroid.R;

public class RegistroActivity extends AppCompatActivity {

    private EditText nombreEditText, apellidoEditText, correoEditText;
    private Button registrarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombreEditText = findViewById(R.id.nombreEditText);
        apellidoEditText = findViewById(R.id.apellidoEditText);
        correoEditText = findViewById(R.id.correoEditText);
        registrarButton = findViewById(R.id.registrarButton);

        registrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nombreEditText.getText().toString().trim();
                String apellido = apellidoEditText.getText().toString().trim();
                String correo = correoEditText.getText().toString().trim();

                if (!nombre.isEmpty() && !apellido.isEmpty() && !correo.isEmpty()) {
                    // Aquí puedes realizar la acción de registro con los datos ingresados

                    // Por ejemplo, mostrar un mensaje de éxito
                    Toast.makeText(RegistroActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();

                    // Abrir la actividad CompletadoActivity y pasar los datos
                    Intent intent = new Intent(RegistroActivity.this, CompletadoActivity.class);
                    intent.putExtra("nombre", nombre);
                    intent.putExtra("apellido", apellido);
                    intent.putExtra("correo", correo);
                    startActivity(intent);
                } else {
                    // Si alguno de los campos está vacío, muestra un mensaje de error
                    Toast.makeText(RegistroActivity.this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
