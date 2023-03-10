package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnCalculadoraSimples;
Button btnNovoJogo;
Button btnCarregarJogo;
Button btnEstatisticas;
Button btnSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculadoraSimples=findViewById(R.id.btnCalculadoraSimples);
        btnCalculadoraSimples.setOnClickListener((View.OnClickListener) view -> {
            Intent in = new Intent(MainActivity.this, CalculadoraSimples.class);
            startActivity(in);
        });

        btnNovoJogo=findViewById(R.id.btnNovoJogo);
        btnNovoJogo.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, NovoJogo.class);
            startActivity(in);
        });

        btnCarregarJogo=findViewById(R.id.btnCarregarJogo);
        btnCarregarJogo.setOnClickListener((View.OnClickListener) view -> {
            Intent in = new Intent(MainActivity.this, CarregarJogo.class);
            startActivity(in);
        });

        btnEstatisticas=findViewById(R.id.btnEstatisticas);
        btnEstatisticas.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, Estatisticas.class);
            startActivity(in);
        });

        btnSobre=findViewById(R.id.btnSobre);
        btnSobre.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, Sobre.class);
            startActivity(in);
        });
    }}