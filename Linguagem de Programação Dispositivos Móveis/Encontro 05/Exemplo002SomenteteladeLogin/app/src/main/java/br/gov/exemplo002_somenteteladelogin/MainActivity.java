package br.gov.exemplo002_somenteteladelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.AlertDialog;
import android.os.Bundle;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edUsername,edPassword;
    private TextView tvUsername,tvPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUsername = (TextView) findViewById(R.id.tvUsername);
        tvPassword = (TextView) findViewById(R.id.tvPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        edUsername = (EditText) findViewById(R.id.edUsername);
        edPassword = (EditText) findViewById(R.id.edPassword);

    }

    public void click(View view) {
        if(view == btnLogin)
            if(edUsername.getText().toString().contains("Oswaldo")&&edPassword.getText().toString().contains("123"))
                Toast.makeText(getApplicationContext(),"Login efetuado com sucesso", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(getApplicationContext(),"Login inválido", Toast.LENGTH_SHORT).show();

    }
}