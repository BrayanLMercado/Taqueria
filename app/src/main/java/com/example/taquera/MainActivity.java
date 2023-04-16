package com.example.taquera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button orden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        orden=(Button)(findViewById(R.id.askOrder));
        orden.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openOrder();
            }
        });
    }
    public void openOrder(){
        Intent intent = new Intent(this,elegirOrden.class);
        startActivity(intent);
    }
    }