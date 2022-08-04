package br.gov.exemplo004_sqlite.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class SQLHelper extends SQLiteOpenHelper {

    private static SQLHelper instance;

    private static final String NOME_BANCO = "sqlitebd";
    private static final int VERSAO_BANCO = 1;

    private SQLHelper(Context ctx){
        super(ctx, NOME_BANCO, null, VERSAO_BANCO);
    }

    public static SQLHelper getInstance(Context ctx){
        if(instance == null){
            instance = new SQLHelper(ctx);
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ContatoDAO.CRIAR_TABELA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
