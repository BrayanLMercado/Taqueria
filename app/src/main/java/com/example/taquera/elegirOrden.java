package com.example.taquera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class elegirOrden extends AppCompatActivity {
    //Botones
    private Button payment;
    private Button bebidas;
    private Button torta;
    private Button burrito;
    private Button Tacos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_elegir_orden); // Lugar actual

        // Uso De Botones
        bebidas= (Button)(findViewById(R.id.Bebidas));
        bebidas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                drinks();
            }
        });

        torta= (Button)(findViewById(R.id.Tortas));
        torta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Torta_();
            }
        });

        burrito= (Button)(findViewById(R.id.Burritos));
        burrito.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Burrito_();
            }
        });

        payment=(Button)(findViewById(R.id.toPayment)); // Lugar de destino
        payment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                payments();
            }
        });

        Tacos=(Button)(findViewById(R.id.Tacos)); // Lugar de destino
        Tacos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Tacos_();
            }
        });
    }
    // Direccionamiento a otras actvidades
    public void payments(){
        Intent intent = new Intent(this,obtenerOrden.class);
        startActivity(intent);
    }
    public void drinks(){
        Intent intent = new Intent(this,bebidas.class);
        startActivity(intent);
    }

    public void Torta_(){
        Intent intent = new Intent(this,tortas.class);
        startActivity(intent);
    }

    public void Burrito_(){
        Intent intent = new Intent(this,burritos.class);
        startActivity(intent);
    }

    public void Tacos_(){
        Intent intent = new Intent(this,tacos.class);
        startActivity(intent);
    }
}