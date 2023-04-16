package com.example.taquera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class metodoDePago extends AppCompatActivity {
    protected Button card;
    protected Button efectivo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_metodo_de_pago); //Lugar Actual
        card=(Button)(findViewById(R.id.tarjeta)); //Destino
        efectivo=(Button)(findViewById(R.id.efectivo));
        card.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                card_();
            }
        });
        efectivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                efectivo_();
            }
        });
    }
    public void card_(){
        Intent intent = new Intent(this,tarjeta.class);
        startActivity(intent);
    }
    public void efectivo_(){
        Intent intent = new Intent(this,direccion.class);
        startActivity(intent);
    }
}