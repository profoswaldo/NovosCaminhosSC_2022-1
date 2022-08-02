package br.gov.exemplo005_sqliteagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private Button btnSalvar, btnCancelar, btnNovo;
    private EditText txtNome, txtEndereco, txtTelefone;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarInterfaceListagem();
    }

    public void CarregarInterfaceListagem()
    {
        setContentView(R.layout.main);

        //configurando o botão de criar novo cadastro
        btnNovo = (Button)findViewById(R.id.btnNovo);
        btnNovo.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                CarregarInterfaceCadastro();
            }});

        CarregarLista(this);
    }

    public void CarregarInterfaceCadastro()
    {
        setContentView(R.layout.cadastro);

        //configurando o botão de cancelar cadastro
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                CarregarInterfaceListagem();
            }});

        //configurando o formulário de cadastro
        txtNome = (EditText)findViewById(R.id.txtNome);
        txtEndereco = (EditText)findViewById(R.id.txtEndereco);
        txtTelefone = (EditText)findViewById(R.id.txtTelefone);

        //configurando o botão de salvar
        btnSalvar = (Button)findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                SalvarCadastro();
            }});
    }

    public void SalvarCadastro()
    {
        DadosAgenda db = new DadosAgenda(this);
        db.InserirContato(txtNome.getText().toString(), txtTelefone.getText().toString(), txtEndereco.getText().toString());
        setContentView(R.layout.main);
        CarregarLista(this);
    }

    public void CarregarLista(Context c)
    {
        DadosAgenda db = new DadosAgenda(c);
        DadosAgenda.ContatosCursor cursor = db.RetornarContatos(DadosAgenda.ContatosCursor.OrdenarPor.NomeCrescente);

        for( int i=0; i <cursor.getCount(); i++)
        {
            cursor.moveToPosition(i);
            ImprimirLinha(cursor.getNome(), cursor.getTelefone());
        }
    }

    public void ImprimirLinha(String nome, String telefone)
    {
        TextView tv = (TextView)findViewById(R.id.listaContatos);

        if(tv.getText().toString().equalsIgnoreCase("Nenhum contato cadastrado."))
            tv.setText("");

        tv.setText(tv.getText() + "\r\n" + nome + " - " + telefone);
    }

}