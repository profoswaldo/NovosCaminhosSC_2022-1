package br.gov.exemplo004_sqlitebasico;

import androidx.appcompat.app.AppCompatActivity;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            //criar Banco de dados
            SQLiteDatabase bancoDados = openOrCreateDatabase("xxx", MODE_PRIVATE, null);

            //Criar Tabela
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas(nome VARCHAR, idade INT(3))");

            //inserir dados na tabela
            bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Oswaldo', 18)");
            bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Jujuba', 20)");
            bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('DiMenor', 10)");
            bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Camila', 21)");

            //consultar pessoas
            Cursor cursor = bancoDados.rawQuery("SELECT nome, idade FROM pessoas", null);

            // indices da tabela

            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();


            while (cursor!=null){

                Log.i("Resultado - nome: ", cursor.getString(indiceNome));
                Log.i("Resultado - Idade: ", cursor.getString(indiceIdade));

                cursor.moveToNext();
            }

        }catch(Exception e){

            e.printStackTrace();

        }




    }
}