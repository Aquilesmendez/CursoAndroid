package com.example.cursoandroid.RegUser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.cursoandroid.R;

public class CompletadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completado);

        TextView nombreTextView = findViewById(R.id.nombreTextView);
        TextView apellidoTextView = findViewById(R.id.apellidoTextView);
        TextView correoTextView = findViewById(R.id.correoTextView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombre = extras.getString("nombre");
            String apellido = extras.getString("apellido");
            String correo = extras.getString("correo");

            // Mostrar los datos en los TextView correspondientes
            nombreTextView.setText("Nombre: " + nombre);
            apellidoTextView.setText("Apellido: " + apellido);
            correoTextView.setText("Correo: " + correo);
        }
    }
}
