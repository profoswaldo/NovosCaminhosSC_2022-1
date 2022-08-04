package br.gov.exemplo001_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamarActivityDois(View view){

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);

    }

    public void chamarActivityTres(View view){

        Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
        startActivity(intent);

    }
}