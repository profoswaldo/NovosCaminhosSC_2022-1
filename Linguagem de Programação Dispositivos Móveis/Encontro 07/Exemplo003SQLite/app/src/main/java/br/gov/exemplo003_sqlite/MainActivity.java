package br.gov.exemplo003_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultText;
    EditText studentId;
    EditText studentName;
    DAOAluno daoAluno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = (TextView) findViewById(R.id.result);
        studentId = (EditText) findViewById(R.id.student_id);
        studentName = (EditText) findViewById(R.id.student_name);
        resultText.setMovementMethod(new ScrollingMovementMethod());
        daoAluno = new DAOAluno(this);

    }

    public void loadStudents(View view) {
        resultText.setText(daoAluno.loadHandler());
        studentId.setText("");
        studentName.setText("");
    }

    public void addStudent (View view) {
        if(!studentId.getText().toString().isEmpty() && !studentName.getText().toString().isEmpty()) {
            int id = Integer.parseInt(studentId.getText().toString());
            String name = studentName.getText().toString();
            Aluno aluno = new Aluno(id, name);
            long insertId= daoAluno.addHandler(aluno);
            if(insertId==-1){
                resultText.setText("Aluno Já Cadastrado");
            }
            else{
                studentId.setText("");
                studentName.setText("");
                resultText.setText("Inclusão realizada com sucesso");
            }
        }
        else{
            resultText.setText("Preecha a matricula e/ou nome corretamente");
        }
    }

    public void updateStudent(View view) {
        if( !studentId.getText().toString().isEmpty() && !studentName.getText().toString().isEmpty()) {
            boolean result = daoAluno.updateHandler(Integer.parseInt(
                    studentId.getText().toString()), studentName.getText().toString());
            if (result) {
                studentId.setText("");
                studentName.setText("");
                resultText.setText("Alteração realizada com sucesso");
            } else {
                resultText.setText("Não foi encontrado nenhum aluno");
            }
        }
        else{
            resultText.setText("Preecha a matricula e/ou nome corretamente");
        }
    }

    public void deleteStudent(View view) {
        if(!studentId.getText().toString().isEmpty()) {
            boolean result = daoAluno.deleteHandler(Integer.parseInt(
                    studentId.getText().toString()));
            if (result) {
                studentId.setText("");
                studentName.setText("");
                resultText.setText("Aluno deletado");
            } else {
                resultText.setText("Não foi encontrado nenhum aluno");
            }
        } else{
            resultText.setText("Preecha a matricula corretamente");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        daoAluno.close();
    }

}