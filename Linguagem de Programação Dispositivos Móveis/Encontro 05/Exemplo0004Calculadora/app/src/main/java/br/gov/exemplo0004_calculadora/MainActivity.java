package br.gov.exemplo0004_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int operacao=0;
    boolean First=false;
    Double valor1;
    Double resultadoOperacao=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView resultado = findViewById(R.id.resultado);

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("7");
            }
        });

        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("8");
            }
        });

        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("9");
            }
        });

        Button btndiv = findViewById(R.id.btndiv);
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                operacao=4;
            }
        });

        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("4");
            }
        });

        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("5");
            }
        });

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("6");
            }
        });

        Button btnmulti = findViewById(R.id.btnmulti);
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                operacao=3;
            }
        });

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("1");
            }
        });

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("2");
            }
        });

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("3");
            }
        });

        Button btnmenos = findViewById(R.id.btnmenos);
        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                operacao=2;
            }
        });

        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(resultado);
                resultado.append("0");
            }
        });

        Button btnponto = findViewById(R.id.btnponto);
        btnponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.append(".");
                First=true;
            }
        });

        Button btnmais = findViewById(R.id.btnsoma);
        btnmais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                operacao=1;
            }
        });

        Button btnPot = findViewById(R.id.btnPot);
        btnPot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                operacao=5;
            }
        });

        Button btnRaiz = findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Double.valueOf(resultado.getText().toString());
                resultado.setText("");
                resultadoOperacao=Math.sqrt(valor1);
                resultado.setText(resultadoOperacao.toString());
                operacao=6;
            }
        });

        Button btnigual = findViewById(R.id.btnigual);
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valor2 = Double.valueOf(resultado.getText().toString());

                switch (operacao) {
                    case 1:
                        resultadoOperacao = valor1 + valor2;
                        break;
                    case 2:
                        resultadoOperacao = valor1 - valor2;
                        break;
                    case 3:
                        resultadoOperacao = valor1 * valor2;
                        break;
                    case 4:
                        resultadoOperacao = valor1 / valor2;
                        break;
                    case 5:
                        resultadoOperacao = Math.pow(valor1, valor2);
                        break;
                    default:
                        resultadoOperacao=0.0;
                        break;
                }

                resultado.setText(resultadoOperacao.toString());
            }
        });


        Button btnlimpar = findViewById(R.id.btnlimpar);
        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1=0.0;
                operacao=0;
                First=false;
                resultado.setText("0");
            }
        });
    }

    private void Click(TextView text){
        if(First==false){
            First=true;
            text.setText("");
        }
    }
}
