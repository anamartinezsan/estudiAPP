package com.example.estudiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class DeveloperActivity extends AppCompatActivity {
    Button btnRestart, btnCrear;
    EditText preguntas,respuestas;
    public static ArrayList<String> ARespuestas = new ArrayList<String>();
    public static ArrayList<String> APreguntas = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        btnRestart = (Button) findViewById(R.id.button5);
        btnCrear=findViewById(R.id.button5);

        preguntas=findViewById(R.id.preguntas);
        respuestas=findViewById(R.id.respuestas);

    }

    public void preguntas(View view) {
        Intent intent=new Intent(this, QActivity.class);
        String ah=preguntas.getText().toString().trim();
        String ag=respuestas.getText().toString().trim();
        if(ag.length() != 0){
            ARespuestas.add(ag);

        }
        if(ah.length() != 0){
            APreguntas.add(ah);

        }
        intent.putExtra("preguntas",preguntas.getText());
        intent.putExtra("respuestas",respuestas.getText());
        //intent.putExtra("respuestas",ARespuestas.getText().);

        startActivity(intent);
    }

    public void volver(View view) {
        Intent in2 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(in2);
    }
}
