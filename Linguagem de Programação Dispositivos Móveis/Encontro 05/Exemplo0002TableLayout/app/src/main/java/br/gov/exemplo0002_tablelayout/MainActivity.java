package br.gov.exemplo0002_tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton = (Button) findViewById(R.id.loginBtn);
    }
    public void logar(View v) {
        Toast.makeText(getApplicationContext(), "Seja muito bem-vindo Oswaldo", Toast.LENGTH_LONG).show();  // display a toast message
    }

}