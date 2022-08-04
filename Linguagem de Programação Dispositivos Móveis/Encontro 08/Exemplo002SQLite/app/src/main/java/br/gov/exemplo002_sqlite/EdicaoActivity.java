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

public class EdicaoActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edicao);


        ed1 = findViewById(R.id.edtNome);
        ed2 = findViewById(R.id.edtCurso);
        ed3 = findViewById(R.id.edtEmail);
        ed4 = findViewById(R.id.id);

        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);


        Intent i = getIntent();

        String t1 = i.getStringExtra("id").toString();
        String t2 = i.getStringExtra("name").toString();
        String t3 = i.getStringExtra("course").toString();
        String t4 = i.getStringExtra("fee").toString();

        ed4.setText(t1);
        ed1.setText(t2);
        ed2.setText(t3);
        ed3.setText(t4);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Delete();
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ListaActivity.class);
                startActivity(i);

            }
        });




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit();
            }
        });

    }

    public void Delete()
    {
        try
        {
            String id = ed4.getText().toString();

            SQLiteDatabase db = openOrCreateDatabase("Banco", Context.MODE_PRIVATE,null);


            String sql = "delete from records where id = ?";
            SQLiteStatement statement = db.compileStatement(sql);

            statement.bindString(1,id);
            statement.execute();
            Toast.makeText(this,"Aluno excluido com sucesso",Toast.LENGTH_LONG).show();


            ed1.setText("");
            ed2.setText("");
            ed3.setText("");
            ed1.requestFocus();


        }
        catch (Exception ex)
        {
            Toast.makeText(this,"Ocorreu um erro na excluão. Favor verificar",Toast.LENGTH_LONG).show();
        }
    }
    public void Edit()
    {
        try
        {
            String name = ed1.getText().toString();
            String course = ed2.getText().toString();
            String fee = ed3.getText().toString();
            String id = ed4.getText().toString();

            SQLiteDatabase db = openOrCreateDatabase("Banco",Context.MODE_PRIVATE,null);


            String sql = "update records set name = ?,course=?,fee=? where id= ?";
            SQLiteStatement statement = db.compileStatement(sql);
            statement.bindString(1,name);
            statement.bindString(2,course);
            statement.bindString(3,fee);
            statement.bindString(4,id);
            statement.execute();
            Toast.makeText(this,"Dados do aluno alterado com sucesso",Toast.LENGTH_LONG).show();


            ed1.setText("");
            ed2.setText("");
            ed3.setText("");
            ed1.requestFocus();


        }
        catch (Exception ex)
        {
            Toast.makeText(this,"Ocorreu um erro na alteração. Favor verificar",Toast.LENGTH_LONG).show();
        }

    }

}