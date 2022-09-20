package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    private Spinner cidades;

    private Button sobreButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cidades  = (Spinner)findViewById(R.id.spin_cidades);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.cidades, android.R.layout.simple_spinner_item);

        cidades.setAdapter(adapter);

        sobreButton = findViewById(R.id.btn_sobre);

        sobreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sobre.class);
                startActivity(intent);
            }
        });
    }




}