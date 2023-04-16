package com.example.taquera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class obtenerOrden extends AppCompatActivity {
    private Button confirmOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obtener_orden); // Lugar actual
        try{
            Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        }catch (NullPointerException e){

        }
        confirmOrder=(Button)(findViewById(R.id.toPay)); //Destino
        confirmOrder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ConfirmOrder();
            }
        });
    }
    public void ConfirmOrder (){
        Intent intent = new Intent (this,metodoDePago.class);
        startActivity(intent);
    }
}