package com.boda.hermann.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText numero1, numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recuperamos los numeoros
        numero1 = (EditText) findViewById(R.id.edN1);
        numero2 = (EditText) findViewById(R.id.edN2);
        final TextView Resultado = (TextView) findViewById(R.id.edResul);
        Button btnSumar = (Button) findViewById(R.id.btnSum);
        Button btnRestar = (Button) findViewById(R.id.btnRest);
        Button btnMultip = (Button) findViewById(R.id.btnMultip);
        Button btnDivid = (Button) findViewById(R.id.btnDivid);


        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                //convertimos los numeros y hacemos la operacion
                Pattern pate = Pattern.compile("^[0-9]+$");
                Matcher mach_num1 = pate.matcher(numero1.getText().toString());
                Matcher mach_num2   = pate.matcher(numero2.getText().toString());

                if(mach_num1.find() && mach_num2.find()) {
                    int n1 = Integer.parseInt(numero1.getText().toString());
                    int n2 = Integer.parseInt(numero2.getText().toString());
                    int sum = n1 + n2;
                    Resultado.setText("" + sum);
                } //fin de if
                else if ((!mach_num1.matches()) &  (mach_num2.matches())  ) { //numero 2
                    Toast.makeText(getApplicationContext(), "Número 1 inválido", Toast.LENGTH_LONG).show();
                }
                else if ((!mach_num2.matches()) &  (mach_num1.matches()) ) {
                    Toast.makeText(getApplicationContext(), "Número 2 inválido", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Operación Inválida", Toast.LENGTH_LONG).show();
                }
            } //fin del metodo Clic
        }); //fin del metodo sumar

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pattern pate = Pattern.compile("^[0-9]+$");
                Matcher mach_num1 = pate.matcher(numero1.getText().toString());
                Matcher mach_num2   = pate.matcher(numero2.getText().toString());

                if(mach_num1.find() && mach_num2.find()) {
                    int n1 = Integer.parseInt(numero1.getText().toString());
                    int n2 = Integer.parseInt(numero2.getText().toString());
                    int resta = n1 - n2;
                    Resultado.setText("" + resta);
                } //fin de if
                else if ((!mach_num1.matches()) &  (mach_num2.matches())  ) { //numero 2
                    Toast.makeText(getApplicationContext(), "Número 1 inválido", Toast.LENGTH_LONG).show();
                }
                else if ((!mach_num2.matches()) &  (mach_num1.matches()) ) {
                    Toast.makeText(getApplicationContext(), "Número 2 inválido", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Operación Inválida", Toast.LENGTH_LONG).show();
                }
                //convertimos los numeros y hacemos la operacion

            } //fin del metodo Clic
        }); //fin del metodo Restar

        btnMultip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pattern pate = Pattern.compile("^[0-9]+$");
                Matcher mach_num1 = pate.matcher(numero1.getText().toString());
                Matcher mach_num2   = pate.matcher(numero2.getText().toString());

                if(mach_num1.find() && mach_num2.find()) {
                    int n1 = Integer.parseInt(numero1.getText().toString());
                    int n2 = Integer.parseInt(numero2.getText().toString());
                    int multip = n1 * n2;
                    Resultado.setText("" + multip);
                } //fin de if
                else if ((!mach_num1.matches()) &  (mach_num2.matches())  ) { //numero 2
                    Toast.makeText(getApplicationContext(), "Número 1 inválido", Toast.LENGTH_LONG).show();
                }
                else if ((!mach_num2.matches()) &  (mach_num1.matches()) ) {
                    Toast.makeText(getApplicationContext(), "Número 2 inválido", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Operación Inválida", Toast.LENGTH_LONG).show();
                }
                //convertimos los numeros y hacemos la operacion

            } //fin del metodo Clic
        }); //fin del metodo Multip

        btnDivid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pattern pate = Pattern.compile("^[0-9]+$");
                Matcher mach_num1 = pate.matcher(numero1.getText().toString()); //numero 1
                Matcher mach_num2   = pate.matcher(numero2.getText().toString()); //numero 2

                if(mach_num1.find() && mach_num2.find()) {
                    int n1 = Integer.parseInt(numero1.getText().toString());
                    int n2 = Integer.parseInt(numero2.getText().toString());
                    int div = n1 / n2;
                    Resultado.setText("" + div);
                } // fin de if

                else if ((!mach_num1.matches()) &  (mach_num2.matches())  ) { //numero 2
                    Toast.makeText(getApplicationContext(), "Número 1 inválido", Toast.LENGTH_LONG).show();
                }
                else if ((!mach_num2.matches()) &  (mach_num1.matches()) ) {
                    Toast.makeText(getApplicationContext(), "Número 2 inválido", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Operación Inválida", Toast.LENGTH_LONG).show();
                }
                //convertimos los numeros y hacemos la operacion
            } //fin del metodo Clic
        }); //fin del metodo Divid
    } //fin de OnCreate
} //fin de MainActivity
