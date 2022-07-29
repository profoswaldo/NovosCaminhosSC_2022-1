package br.gov.exemplo002_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    SharedPreferences shp;
    SharedPreferences.Editor shpEditor;
    EditText edtUserId, edtPassword;
    Button btnLogin;
    TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserId = findViewById(R.id.edtUserid);
        edtPassword = findViewById(R.id.edtPassword);
        edtUserId.setText("");
        edtPassword.setText("");
        btnLogin = findViewById(R.id.btnLogin);
        txtInfo = findViewById(R.id.txtInfo);
        shp = getSharedPreferences("myPreferences", MODE_PRIVATE);
        CheckLogin();
    }

    public void onClick(View v) {
        if (edtUserId.getText().toString().equals("") || edtPassword.getText().toString().equals(""))
            txtInfo.setText("Entre com seu usuário e sua senha");
        else
            DoLogin(edtUserId.getText().toString(), edtPassword.getText().toString());
    }

    public void CheckLogin() {
        if (shp == null)
            shp = getSharedPreferences("myPreferences", MODE_PRIVATE);

        String userName = shp.getString("name", "");

        if (userName != null && !userName.equals("")) {
            Intent i = new Intent(Login.this, MainActivity.class);
            startActivity(i);
            finish();
        }
    }

    public void DoLogin(String userid, String password) {
        try {
            if (password.equals("professor")) {
                if (shp == null)
                    shp = getSharedPreferences("myPreferences", MODE_PRIVATE);

                shpEditor = shp.edit();
                shpEditor.putString("name", userid);
                shpEditor.commit();

                Intent i = new Intent(Login.this, MainActivity.class);
                startActivity(i);
                finish();
            } else
                txtInfo.setText("Senha ou usuário Inválido");
        } catch (Exception ex) {
            txtInfo.setText(ex.getMessage().toString());
        }
    }


}