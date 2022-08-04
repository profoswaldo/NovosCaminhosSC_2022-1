package br.gov.exemplo004_sqlite.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import br.gov.exemplo004_sqlite.pojo.Contato;


public class ContatoDAO {

    private SQLiteDatabase db;

    public static final String NOME_TABELA = "contato";
    public static final String COLUNA_NOME = "nome";
    public static final String COLUNA_ID = "id";
    public static final String COLUNA_EMAIL = "email";
    public static final String COLUNA_TELEFONE = "telefone";
    public static final String CRIAR_TABELA = "CREATE TABLE "+NOME_TABELA+"("+COLUNA_ID+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE, "+COLUNA_NOME+" TEXT NOT NULL, "+COLUNA_EMAIL+" TEXT UNIQUE, "+COLUNA_TELEFONE+" TEXT UNIQUE)";

    public ContatoDAO(Context ctx){
        db = SQLHelper.getInstance(ctx).getWritableDatabase();
    }

    public boolean salvar(Contato contato){
        long i = db.insert(NOME_TABELA, null, contatoContentValues(contato));

        //Se id for igual a -1, retorna false, se não, retorna verdadeiro
        //(o método insert retorna -1 quando a query falha na execução)
        return i == -1 ? false : true;
    }

    //delete from tabela where id = ?
    public boolean deletar(Contato contato){
        String where = COLUNA_ID+ "=?";

        String[] whereArgs = {
                contato.getId().toString()
        };

        long i = db.delete(NOME_TABELA, where, whereArgs);

        //Se id for igual a -1, retorna false, se não, retorna verdadeiro
        //(o método delete retorna -1 quando a query falha na execução)
        return i == -1 ? false : true;
    }

    public boolean editar(Contato contato){
        String where = COLUNA_ID + " =?";

        String[] whereArgs = {
                contato.getId().toString()
        };

        long i = db.update(NOME_TABELA, contatoContentValues(contato), where, whereArgs);

        //Se id for igual a -1, retorna false, se não, retorna verdadeiro
        //(o método update retorna -1 quando a query falha na execução)
        return i == -1 ? false : true;

    }

    public ArrayList<Contato> listar(){
        ArrayList<Contato> listaContatos = new ArrayList<Contato>();
        String sqlBusca = "select * from " + NOME_TABELA;
        Cursor cursor = db.rawQuery(sqlBusca,null);

        Contato contato;

        int indiceId = cursor.getColumnIndex(COLUNA_ID);
        int indiceNome = cursor.getColumnIndex(COLUNA_NOME);
        int indiceEmail = cursor.getColumnIndex(COLUNA_EMAIL);
        int indiceTelefone = cursor.getColumnIndex(COLUNA_TELEFONE);

        while(cursor.moveToNext()){

            contato = new Contato();

            contato.setId(cursor.getString(indiceId));
            contato.setNome(cursor.getString(indiceNome));
            contato.setEmail(cursor.getString(indiceEmail));
            contato.setTelefone(cursor.getString(indiceTelefone));

            listaContatos.add(contato);

        }

        return listaContatos;
    }

    private ContentValues contatoContentValues(Contato contato){

        ContentValues cv = new ContentValues();

        cv.put(COLUNA_NOME, contato.getNome());
        cv.put(COLUNA_EMAIL, contato.getEmail());
        cv.put(COLUNA_TELEFONE, contato.getTelefone());

        return cv;

    }

}
