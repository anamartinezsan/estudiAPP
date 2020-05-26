package com.example.estudiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class options extends AppCompatActivity {
ImageButton btnCiencia, btnMate, btnLengua;
TextView name1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        btnCiencia= findViewById(R.id.btnCiencia);
        btnMate=findViewById(R.id.btnMate);
        btnLengua=findViewById(R.id.btnLengua);
        name1=findViewById(R.id.name);

        TextView textView=(TextView)findViewById(R.id.DispName);
        Intent intent = getIntent();
         String name= intent.getStringExtra("myname");


    }

    public void ciencia(View view) {
        Intent intent=new Intent(getApplicationContext(),QuestionsActivity.class);
        String name=name1.getText().toString();
        startActivity(intent);
        intent.putExtra("myname",name);

    }

    public void lengua(View view) {
        Intent intent=new Intent(getApplicationContext(),QuestionsActivity.class);
        String name=name1.getText().toString();
        startActivity(intent);
        intent.putExtra("myname",name);
    }

    public void mate(View view) {
        Intent intent=new Intent(getApplicationContext(),QuestionsActivity.class);
        String name=name1.getText().toString();
        startActivity(intent);
        intent.putExtra("myname",name);

    }
}
