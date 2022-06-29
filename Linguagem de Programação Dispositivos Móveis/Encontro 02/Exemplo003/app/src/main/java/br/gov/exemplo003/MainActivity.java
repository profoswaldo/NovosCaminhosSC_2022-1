package br.gov.exemplo003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView_result;
    EditText editText_valor1;
    EditText editText_valor2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_result = (TextView) findViewById(R.id.textViewResult);
        editText_valor1 = (EditText) findViewById(R.id.editTextValor1);
        editText_valor2 = (EditText) findViewById(R.id.editTextValor2);
    }


    public void somar(View view){

        double valor1 = Double.parseDouble(editText_valor1.getText().toString());
        double valor2 = Double.parseDouble(editText_valor2.getText().toString());

        double resultado = valor1 + valor2;

        textView_result.setText(Double.toString(resultado));
    }
}