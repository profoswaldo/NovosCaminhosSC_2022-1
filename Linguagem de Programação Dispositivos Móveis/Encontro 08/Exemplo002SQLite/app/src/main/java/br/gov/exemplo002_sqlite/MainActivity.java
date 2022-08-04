package br.gov.exemplo002_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.edtNome);
        ed2 = findViewById(R.id.edtCurso);
        ed3 = findViewById(R.id.edtEmail);

        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), ListaActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert();
            }
        });
    }

    public void insert()
    {
        try
        {
            String name = ed1.getText().toString();
            String course = ed2.getText().toString();
            String fee = ed3.getText().toString();

            SQLiteDatabase db = openOrCreateDatabase("Banco",Context.MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS records(id INTEGER PRIMARY KEY AUTOINCREMENT,name VARCHAR,course VARCHAR,fee VARCHAR)");

            String sql = "insert into records(name,course,fee)values(?,?,?)";
            SQLiteStatement statement = db.compileStatement(sql);
            statement.bindString(1,name);
            statement.bindString(2,course);
            statement.bindString(3,fee);
            statement.execute();
            Toast.makeText(this,"Inclusão realizada com sucesso",Toast.LENGTH_LONG).show();

            ed1.setText("");
            ed2.setText("");
            ed3.setText("");
            ed1.requestFocus();
        }
        catch (Exception ex)
        {
            Toast.makeText(this,"Ocorreu um erro na Inclusão. Favor verificar",Toast.LENGTH_LONG).show();
        }
    }
}