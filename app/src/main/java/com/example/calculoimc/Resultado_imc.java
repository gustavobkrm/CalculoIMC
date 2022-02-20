package com.example.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Resultado_imc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("teste2", "teste2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_imc);
        TextView out = findViewById(R.id.textViewOutput);

        Intent it = getIntent();

        if (it != null){
            Double peso = Double.parseDouble(it.getStringExtra("peso"));
            Double altura = Double.parseDouble(it.getStringExtra("altura"));
            String nome = it.getStringExtra("nome");

            Double result = peso / ((altura * altura)/10000);

            DecimalFormat resultadoFormatado = new DecimalFormat("#.##");
            result = Double.valueOf(resultadoFormatado.format(result));

            if (result < 15){
                out.setText(nome + " - IMC: " + result + " - Extremamente abaixo do peso");
            }
            else if (result == 15 || result == 16){
                out.setText(nome + " - IMC: " + result + " - Gravemente abaixo do peso");
            }
            else if (result < 18.5 && result > 15) {
                out.setText(nome + " - IMC: " + result + " - Abaixo do peso");
            }
            else if (result < 25 && result > 18) {
                out.setText(nome + " - IMC: " + result + " - Peso Ideal!");
            }
            else if (result < 30 && result > 25){
                out.setText(nome +" - IMC: " + result + " - Acima do peso");
            }
            else if (result < 35 && result > 30){
                out.setText(nome + " - IMC: " + result + " - Gravemente acima do peso");
            }
            else if (result > 35)
                out.setText(nome + " - IMC: " + result + " - Extremamente acima do peso");
        }
    }


}