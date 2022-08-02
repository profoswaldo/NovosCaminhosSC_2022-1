package br.gov.exemplo003_sqlite;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DAOAluno extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "studentDB.db";
    private static final String TABLE_STUDENTS = "students";
    private static final String COLUMN_ID = "StudentID";
    private static final String COLUMN_NAME = "StudentName";

    DAOAluno(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_STUDENT_TABLE = "CREATE TABLE " +
                TABLE_STUDENTS + "(" + COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_NAME
                + " TEXT " + ")";
        db.execSQL(CREATE_STUDENT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);
        onCreate(db);
    }

    String loadHandler() {
        String result = "";
        String query = "Select*FROM " + TABLE_STUDENTS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            int result_0 = cursor.getInt(0);
            String result_1 = cursor.getString(1);
            result += String.valueOf(result_0) + " " + result_1 +
                    System.getProperty("line.separator");
        }
        cursor.close();
        db.close();
        if(result.equals(""))
            result="No Record Found";
        return result;
    }

    long addHandler(Aluno aluno) {
        long id;
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, aluno.getID());
        values.put(COLUMN_NAME, aluno.getStudentName());
        SQLiteDatabase db = this.getWritableDatabase();
        id = db.insert(TABLE_STUDENTS, null, values);
        db.close();
        return id;
    }

    boolean updateHandler(int ID, String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues args = new ContentValues();
        args.put(COLUMN_ID, ID);
        args.put(COLUMN_NAME, name);
        return db.update(TABLE_STUDENTS, args, COLUMN_ID + "=" + ID, null) > 0;
    }

    boolean deleteHandler(int ID) {
        boolean result = false;
        String query = "Select*FROM " + TABLE_STUDENTS + " WHERE " + COLUMN_ID + " = '" + String.valueOf(ID) + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Aluno aluno = new Aluno();
        if (cursor.moveToFirst()) {
            aluno.setID(Integer.parseInt(cursor.getString(0)));
            db.delete(TABLE_STUDENTS, COLUMN_ID + "=?",
                    new String[] {
                            String.valueOf(aluno.getID())
                    });
            cursor.close();
            result = true;
        }
        db.close();
        return result;
    }

}