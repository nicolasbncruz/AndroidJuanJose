package com.nicolasbncruz.androidjuanjose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSumar;
    EditText edit1;
    EditText edit2;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSumar = findViewById(R.id.btnSumar);
        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        lblResultado = findViewById(R.id.lblResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = edit1.getText().toString();
                String numero2 = edit2.getText().toString();
                double valor1 = numero1.isEmpty()?0:Double.valueOf(numero1);
                double valor2 = numero2.isEmpty()?0:Double.valueOf(numero2);
                double resultado = valor1 + valor2;
                lblResultado.setText(String.valueOf(resultado));
            }
        });
    }
}
