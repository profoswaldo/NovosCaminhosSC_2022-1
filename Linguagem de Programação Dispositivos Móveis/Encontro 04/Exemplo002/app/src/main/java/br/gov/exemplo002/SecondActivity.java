package br.gov.exemplo002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
    }

    public void chamarActivityUm(View view){

        Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
        startActivity(intent);

    }
}