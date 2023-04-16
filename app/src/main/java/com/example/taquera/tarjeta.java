package com.example.taquera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class tarjeta extends AppCompatActivity {
    private Button confirmPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_tarjeta); // Lugar Actual
        confirmPay=(Button)(findViewById(R.id.toDireccion)); //Destino
        confirmPay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ConfirmPay();
            }
        });
    }
    public void ConfirmPay(){
        Intent intent = new Intent (this,direccion.class);
        startActivity(intent);
    }

    static boolean checkLuhn(String cardNum){
        int nDigit=cardNum.length();
        int nSum = 0;
        boolean isSecond = false;
        for (int i=nDigit-1;i>=0;i--){
            int d= cardNum.charAt(i)-'0';
            if (isSecond==true){
                d=d*2;
                nSum+=d/10;
                nSum+=d%10;
                isSecond=!isSecond;
            }
        }
        return (nSum%10 == 0);
    }

    static public void main (String[] args)
    {
        String cardNo = "79927398713";
        if (checkLuhn(cardNo))
            System.out.println("This is a valid card");
        else
            System.out.println("This is not a valid card");

    }
}