package br.gov.exemplo002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtValor1;
    private EditText edtValor2;
    private EditText edtResultado;

    private Calculadora calculadora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculadora = new Calculadora();

        edtValor1 = (EditText) findViewById(R.id.editText_valor1);
        edtValor2 = (EditText) findViewById(R.id.editText_valor2);
        edtResultado = (EditText) findViewById(R.id.editText_resultado);

    }

    public void click_somar(View view){

        calculadora.setValor1(Double.parseDouble(edtValor1.getText().toString()));
        calculadora.setValor2(Double.parseDouble(edtValor2.getText().toString()));
        edtResultado.setText(Double.toString(calculadora.somar()));

    }

    public void click_subtrair(View view){
        calculadora.setValor1(Double.parseDouble(edtValor1.getText().toString()));
        calculadora.setValor2(Double.parseDouble(edtValor2.getText().toString()));
        edtResultado.setText(Double.toString(calculadora.subtrair()));

    }

    public void click_multiplicar(View view){
        calculadora.setValor1(Double.parseDouble(edtValor1.getText().toString()));
        calculadora.setValor2(Double.parseDouble(edtValor2.getText().toString()));
        edtResultado.setText(Double.toString(calculadora.multiplicar()));

    }

    public void click_dividir(View view){
        calculadora.setValor1(Double.parseDouble(edtValor1.getText().toString()));
        calculadora.setValor2(Double.parseDouble(edtValor2.getText().toString()));
        edtResultado.setText(Double.toString(calculadora.dividir()));

    }

    public void click_limpar(View view){

        edtValor1.setText(null);
        edtValor2.setText(null);
        edtResultado.setText(null);

    }
}