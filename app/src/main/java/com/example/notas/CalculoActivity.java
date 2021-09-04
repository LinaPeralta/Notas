package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CalculoActivity extends AppCompatActivity {

    private Button calculoBtn;
    private EditText proyecto1Text;
    private EditText proyecto2Text;
    private EditText quicesText;
    private EditText parcial1Text;
    private EditText parcial2Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        calculoBtn =  findViewById(R.id.calcularBtn);
        proyecto1Text =  findViewById(R.id.proyecto1);
        proyecto2Text =  findViewById(R.id.proyecto2);
        quicesText =  findViewById(R.id.quicesBtn);
        parcial1Text =  findViewById(R.id.parcial1);
        parcial2Text =  findViewById(R.id.parcial2);








    }
}