package br.gov.exemplo001_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_third);
        }

        public void chamarActivityUm(View view){

            Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
            startActivity(intent);

        }

    public void chamarActivityDois(View view){

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);

    }
    }