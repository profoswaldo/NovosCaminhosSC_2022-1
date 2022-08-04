package br.gov.exemplo004_sqlite;



import android.os.Bundle;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.gov.exemplo004_sqlite.dao.ContatoDAO;
import br.gov.exemplo004_sqlite.pojo.Contato;


public class TelaCadastro extends Activity {

    private EditText etNome, etEmail, etTelefone;
    private Button btSalvar;
    private Contato contato;
    private TextView tvCadastrar;
    private ContatoDAO contatoDAO;

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cadastrar);

        this.inicializaComponentes();


        this.btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                contato.setNome(etNome.getText().toString());
                contato.setTelefone(etTelefone.getText().toString());
                contato.setEmail(etEmail.getText().toString());

                boolean salvou = contatoDAO.salvar(contato);

                if (salvou){
                    Toast.makeText(TelaCadastro.this, "Contato salvo: " + contato.getNome(),Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(TelaCadastro.this, "Erro ao salvar",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    private void inicializaComponentes(){
        this.etNome = (EditText)findViewById(R.id.et_nome_editar);
        this.tvCadastrar = (TextView) findViewById(R.id.tv_cadastrar);
        this.etEmail = (EditText)findViewById(R.id.et_email_editar);
        this.etTelefone = (EditText)findViewById(R.id.et_Telefone);
        this.btSalvar = (Button)findViewById(R.id.bt_Salvar);
        this.contato = new Contato();
        this.contatoDAO = new ContatoDAO(getApplicationContext());
    }
}
