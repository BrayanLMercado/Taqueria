package com.example.taquera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class bebidas extends AppCompatActivity {
    protected Button obtOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_bebidas);// Lugar Actual
        obtOrder=(Button)findViewById(R.id.confirmar);//Destino
        obtOrder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                obtOrder_();
            }
        });
    }
    public void obtOrder_(){
        Intent intent = new Intent(this,elegirOrden.class);
        startActivity(intent);
    }
}