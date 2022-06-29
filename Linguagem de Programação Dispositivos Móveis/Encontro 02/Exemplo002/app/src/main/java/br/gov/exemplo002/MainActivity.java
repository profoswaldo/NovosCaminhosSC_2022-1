package br.gov.exemplo002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = (TextView) findViewById(R.id.mensagem);
    }

    public void clicarFuncao(View view){

        msg.setText("Professor");

    }

    public void clicarNome(View view){

        msg.setText("Oswaldo");

    }


}