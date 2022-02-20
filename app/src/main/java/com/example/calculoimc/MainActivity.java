package com.example.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view){
        EditText peso = findViewById(R.id.editTextTextPeso);
        EditText altura = findViewById(R.id.editTextTextAltura);
        EditText nome = findViewById(R.id.editTextTextNome);

        Intent it = new Intent(this, Resultado_imc.class);

        it.putExtra("peso", peso.getText().toString());
        it.putExtra("altura", altura.getText().toString());
        it.putExtra("nome", nome.getText().toString());

        startActivity(it);
    }

}