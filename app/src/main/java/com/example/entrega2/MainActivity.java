package com.example.entrega2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] idImagen = {
                R.drawable.img_1,
                R.drawable.img_2,
                R.drawable.img_3,
                R.drawable.img_4,
                R.drawable.img_5,
                R.drawable.img_6
        };

        String[] nombre = {
                "Juan Marin",
                "Raul Sanchez",
                "Brenda Lopez",
                "Daniela Marin",
                "Maria Toro",
                "Tatiana Sandoval"
        };

        String[] asunto ={
                "Solicitud Credito", "Ingresar nuevos clientes","Aprobacion de vuelo","Solicitud de empleo",
                "Matricula aceptada","Promocion dia sin iva"
        };

        String[] cuerpoMensaje ={
                "Hola queremos informarte que la solicitud de credito radicada el dia 2022-03-15 fue aprobada",
                "Hola me puedes ayudar con el ingreso de los cliente nuevos que te mencione en la reunion pasada.",
                "Informamos que el vuelo programado para el dia 2022-04-10 fue aprobado, en las proximas horas enviaremos la informacion completa",
                "Te informamos que tenemos una nueva vacante como desarrollador Android y queremos que nos cuentes un poco mas acerca de ti",
                "Desde nuestra institucion nos alegra informarte que fuiste aceptado en la facultad de ingenieria para el programa " +
                        "ingenieria de software modalidad (presencial)",
                "Para este dia sin iva encuentra descuentos adicionales al 19% del iv ingresa a nuestro sitio web oficial para conocer mas."
        };

        String[] horaUltimoMensaje ={
                "08:20", "20:50","13:40","03:44","10:45","06:15"
        };

        ListAdapter listAdapter = new ListAdapter(MainActivity.this, nombre,asunto,horaUltimoMensaje,idImagen, cuerpoMensaje);
        lista = (ListView) findViewById(R.id.listaView);
        lista.setAdapter(listAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {
                Intent intent = new Intent(getBaseContext(), MainActivity2.class);
                intent.putExtra("nombre", nombre[posicion]);
                intent.putExtra("asunto", asunto[posicion]);
                intent.putExtra("cuerpoMensaje", cuerpoMensaje[posicion]);
                intent.putExtra("hora", horaUltimoMensaje[posicion]);
                startActivity(intent);

            }
        });

    }
}