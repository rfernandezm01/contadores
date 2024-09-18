package com.example.sumadororiginal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int contador;
    TextView contadorall;
    TextView contador1;
    TextView contador2;
    TextView contador3;
    TextView contador4;
    Button superreset;
    Button reset;
    Button reset2;
    Button reset3;
    Button reset4;

    Button suma1;
    Button suma2;
    Button suma3;
    Button suma4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       contadorall = findViewById(R.id.Total);
       contador1 = findViewById(R.id.c1);
        contador2 = findViewById(R.id.c2);
        contador3 = findViewById(R.id.c3);
        contador4 = findViewById(R.id.c4);

        superreset = findViewById(R.id.bottontotal);
        reset = findViewById(R.id.extra1);
        reset2 = findViewById(R.id.extra2);
        reset3 = findViewById(R.id.extra3);
        reset4 = findViewById(R.id.extra4);

        suma1 = findViewById(R.id.botton1);
        suma2 = findViewById(R.id.botton2);
        suma3 = findViewById(R.id.botton3);
        suma4 = findViewById(R.id.botton4);

       superreset.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("SetTextI18n")
           @Override
           public void onClick(View view) {
               contador = 0;
               contadorall.setText(contador);
               contador1.setText(contador);
               contador2.setText(contador);
               contador3.setText(contador);
               contador4.setText(contador);
           }
       });
        reset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                contador = 0;
                contador1.setText(contador);
            }
        });
        reset2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                contador = 0;
                contador2.setText(contador);
            }
        });
        reset3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                contador = 0;
                contador3.setText(contador);
            }
        });
        reset4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                contador = 0;
                contador4.setText(contador);
            }
        });
        suma1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                contador++;
                contador1.setText(contador);
                contadorall.setText(contador);
            }
        });
        suma2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                contador++;
                contador2.setText(contador);
                contadorall.setText(contador);
            }
        });
        suma3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                contador++;
                contador3.setText(contador);
                contadorall.setText(contador);
            }
        });
        suma4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                contador++;
                contador4.setText(contador);
                contadorall.setText(contador);
            }
        });

    }
}