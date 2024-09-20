package com.example.sumadororiginal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int Contadorall, Contador1, Contador2, Contador3, Contador4;
    TextView contadorall, contador1, contador2, contador3, contador4;

    Button superreset, reset, reset2, reset3, reset4, suma1, suma2, suma3, suma4;

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

        // Función para actualizar el valor de Contadorall
        updateTotal();

        superreset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Contadorall = 0;
                Contador1 = 0;
                Contador2 = 0;
                Contador3 = 0;
                Contador4 = 0;
                updateViews();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Contador1 = 0;
                updateViews();
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Contador2 = 0;
                updateViews();
            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Contador3 = 0;
                updateViews();
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Contador4 = 0;
                updateViews();
            }
        });

        suma1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Contador1++;
                updateViews();
            }
        });

        suma2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Contador2++;
                updateViews();
            }
        });

        suma3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Contador3++;
                updateViews();
            }
        });

        suma4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Contador4++;
                updateViews();
            }
        });
    }

    // Función para actualizar el valor de Contadorall
    private void updateTotal() {
        Contadorall = Contador1 + Contador2 + Contador3 + Contador4;
    }

    // Función para actualizar las vistas
    @SuppressLint("SetTextI18n")
    private void updateViews() {
        contador1.setText(String.valueOf(Contador1));
        contador2.setText(String.valueOf(Contador2));
        contador3.setText(String.valueOf(Contador3));
        contador4.setText(String.valueOf(Contador4));
        updateTotal(); // Actualiza el valor total
        contadorall.setText(String.valueOf(Contadorall));
    }
}
