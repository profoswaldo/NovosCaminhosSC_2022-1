package br.gov.pronatec.exemplo001_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    TextView textViewNome;
    TextView textViewEmail;
    public static final String arquivo_Preferencias = "arquivo_Preferencias";
    public static final String varNome = "chave_Nome";
    public static final String varEmail = "chave_Email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewNome = (TextView) findViewById(R.id.editTextNome);
        textViewEmail = (TextView) findViewById(R.id.editTextEmail);
        sharedpreferences = getSharedPreferences(arquivo_Preferencias,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(varNome)) {
            textViewNome.setText(sharedpreferences.getString(varNome, ""));
        }
        if (sharedpreferences.contains(varEmail)) {
            textViewEmail.setText(sharedpreferences.getString(varEmail, ""));

        }

    }

    public void gravar(View view) {
        String n = textViewNome.getText().toString();
        String e = textViewEmail.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(varNome, n);
        editor.putString(varEmail, e);
        editor.commit();
    }

    public void limpar(View view) {
        textViewNome = (TextView) findViewById(R.id.editTextNome);
        textViewEmail = (TextView) findViewById(R.id.editTextEmail);
        textViewNome.setText("");
        textViewEmail.setText("");

    }

    public void ler(View view) {
        textViewNome = (TextView) findViewById(R.id.editTextNome);
        textViewEmail = (TextView) findViewById(R.id.editTextEmail);
        sharedpreferences = getSharedPreferences(arquivo_Preferencias,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(varNome)) {
            textViewNome.setText(sharedpreferences.getString(varNome, ""));
        }
        if (sharedpreferences.contains(varEmail)) {
            textViewEmail.setText(sharedpreferences.getString(varEmail, ""));

        }
    }


}