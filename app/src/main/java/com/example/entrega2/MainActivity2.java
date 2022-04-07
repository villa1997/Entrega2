package com.example.entrega2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String mensaje, asunto, nombre;
    TextView asuntoVista;
    TextView nombreRemitente;
    TextView mensajeRemitente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mensaje = getIntent().getStringExtra("cuerpoMensaje");
        asunto = getIntent().getStringExtra("asunto");
        nombre = getIntent().getStringExtra("nombre");

        asuntoVista = findViewById(R.id.asunto);
        mensajeRemitente = findViewById(R.id.cuerpoMensaje);
        nombreRemitente = findViewById(R.id.remitente);

        asuntoVista.setText(asunto);
        nombreRemitente.setText("Remitente: "+nombre);
        mensajeRemitente.setText(mensaje);

    }
}