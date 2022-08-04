package br.gov.exemplo004_sqlite;



import android.os.Bundle;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import br.gov.exemplo004_sqlite.dao.ContatoDAO;
import br.gov.exemplo004_sqlite.pojo.Contato;

public class TelaEditar extends Activity{

    private EditText etNome, etEmail, etTelefone;
    private Button btEditar;
    private ContatoDAO contatoDAO;
    private Contato contato;
    private TextView tvEditar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_editar);

        inicializaComponentes();

        this.etEmail.setText(contato.getEmail());
        this.etNome.setText(contato.getNome());
        this.etTelefone.setText(contato.getTelefone());

        this.btEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contato.setNome(etNome.getText().toString());
                contato.setEmail(etEmail.getText().toString());
                contato.setTelefone(etTelefone.getText().toString());
                boolean editou = contatoDAO.editar(contato);
                if(editou){
                    Toast.makeText(TelaEditar.this, "Contato atualizado", Toast.LENGTH_LONG).show();
                    finish();
                }else{
                    Toast.makeText(TelaEditar.this, "Deu ruim", Toast.LENGTH_LONG).show();
                    finish();
                }


            }
        });

    }

    private void inicializaComponentes() {
        this.etNome = (EditText) findViewById(R.id.et_nome_editar);
        this.etEmail = (EditText) findViewById(R.id.et_email_editar);
        this.etTelefone = (EditText) findViewById(R.id.et_telefone_editar);
        this.btEditar = (Button) findViewById(R.id.bt_editar);
        this.tvEditar = (TextView) findViewById(R.id.tv_editar);
        this.contatoDAO = new ContatoDAO(this);
        contato = (Contato) getIntent().getExtras().getSerializable("contato");
    }
}
