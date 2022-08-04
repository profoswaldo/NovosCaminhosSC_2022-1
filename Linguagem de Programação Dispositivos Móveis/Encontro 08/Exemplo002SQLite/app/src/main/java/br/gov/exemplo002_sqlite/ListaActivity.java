package br.gov.exemplo002_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    ListView lst1;
    ArrayList<String> titles = new ArrayList<String>();
    ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        SQLiteDatabase db = openOrCreateDatabase("Banco",Context.MODE_PRIVATE,null);

        lst1 = findViewById(R.id.lst1);
        final Cursor c = db.rawQuery("select * from records",null);
        int id = c.getColumnIndex("id");
        int name = c.getColumnIndex("name");
        int course = c.getColumnIndex("course");
        int fee = c.getColumnIndex("fee");
        titles.clear();


        arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,titles);
        lst1.setAdapter(arrayAdapter);

        final  ArrayList<Aluno> stud = new ArrayList<Aluno>();


        if(c.moveToFirst())
        {
            do{
                Aluno stu = new Aluno();
                stu.id = c.getString(id);
                stu.nome = c.getString(name);
                stu.curso = c.getString(course);
                stu.email = c.getString(fee);
                stud.add(stu);

                titles.add(c.getString(id) + " \t " + c.getString(name) + " \t "  + c.getString(course) + " \t "  + c.getString(fee) );

            } while(c.moveToNext());
            arrayAdapter.notifyDataSetChanged();
            lst1.invalidateViews();



        }

        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String aa = titles.get(position).toString();
                Aluno stu = stud.get(position);
                Intent i = new Intent(getApplicationContext(), EdicaoActivity.class);
                i.putExtra("id",stu.id);
                i.putExtra("name",stu.nome);
                i.putExtra("course",stu.curso);
                i.putExtra("fee",stu.email);
                startActivity(i);

            }
        });

    }
}