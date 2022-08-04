package br.gov.exemplo001_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void chamarActivityUm(View view){

        Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
        startActivity(intent);

    }

    public void chamarActivityTres(View view){

        Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
        startActivity(intent);

    }
}