package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Sobre extends AppCompatActivity {

    Button button;
    Button gridButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        button = findViewById(R.id.button);
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(Sobre.this,  "Click Longo Realizado;", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        gridButton = findViewById(R.id.btn_grid);

        gridButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sobre.this, gridView.class);
                startActivity(intent);
            }
        });

        ListView lista = (ListView) findViewById(R.id.lista);

        ArrayList<String> blocos = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, blocos);

        lista.setAdapter(arrayAdapter);
    }

    private  ArrayList<String> preencherDados(){
        ArrayList<String> blocos = new ArrayList<String>();
        blocos.add("Bloco de Ciências");
        blocos.add("Bloco de Física");
        blocos.add("Bloco de História");

        return blocos;
    }
}