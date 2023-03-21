package com.example.proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout Fondo;
    Button Azul,Rojo,Verde;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Fondo= (LinearLayout) findViewById(R.id.activity_main);
        Azul=(Button) findViewById(R.id.BAzul);
        Rojo=(Button) findViewById(R.id.BRojo);
        Verde=(Button) findViewById(R.id.BVerde);

        Azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Elcolor de fondo acambiado a azul",Toast.LENGTH_SHORT).show();
                Fondo.setBackgroundColor(Color.BLUE);
            }
        });

       Rojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Elcolor de fondo acambiado a rojo",Toast.LENGTH_SHORT).show();
                Fondo.setBackgroundColor(Color.RED);
            }
        });

        Verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Elcolor de fondo acambiado a verde",Toast.LENGTH_SHORT).show();
                Fondo.setBackgroundColor(Color.GREEN);
            }
        });



    }
}

