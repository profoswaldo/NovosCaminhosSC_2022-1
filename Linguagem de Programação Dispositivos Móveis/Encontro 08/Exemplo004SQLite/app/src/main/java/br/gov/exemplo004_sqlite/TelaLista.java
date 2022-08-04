package br.gov.exemplo004_sqlite;


import android.os.Bundle;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

import br.gov.exemplo004_sqlite.dao.ContatoDAO;
import br.gov.exemplo004_sqlite.pojo.Contato;


public class TelaLista extends ListActivity {

    private ContatoDAO contatoDAO;
    private Contato contatoSelecionado;
    private ArrayAdapter<Contato> adapterContatos;
    private ArrayList<Contato> listaContatos;
    private Dialog dialogDeletarContato;
    private AlertDialog.Builder builder;
    private int posicao;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Chama o método que inicializa os componentes
        inicializaComps();

        //Seta a lista que será exibida na ListActivity através de um adapter
        setListAdapter(adapterContatos);

        //Permite que a lista dessa activity trabalhe com menus de contexto em seus itens
        registerForContextMenu(getListView());
    }

    //Método para inicializar os componentes
    public void inicializaComps(){
        contatoDAO = new ContatoDAO(this);
        this.listaContatos = contatoDAO.listar();
        adapterContatos = new ArrayAdapter<Contato>(this, android.R.layout.simple_list_item_1, listaContatos);
    }

    //Método para "atualizar" a activity sempre que for chamada. Isso garante que o contato aparecerá
    //com os dados atualizados após a tela de edição.
    @Override
    protected void onResume() {
        super.onResume();
        this.onCreate(null);
    }

    //Método para criar o ContextMenu dos itens da lista (opções de editar ou excluir)
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //Adiciono um "título" para o ContextMenu
        menu.setHeaderTitle("Escolha uma opção:");

        //Adiciono as opções do menu através do método add()
        //Parâmetros add: (grupo de itens, id do item, ordem dos itens, mensagem do item)
        menu.add(Menu.NONE,1,Menu.NONE, "Editar");
        menu.add(Menu.NONE,2,Menu.NONE, "Excluir");

    }

    //Sobrescrição do método onContextItemSelected para definir ações quando pressionamos um item da lista
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        //Através da classe AdapterView.AdapterContextMenuInfo consigo pegar informações do item que chamou o ContextMenu
        //Implemento essa classe no objeto itemInfo
        AdapterView.AdapterContextMenuInfo itemInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        //Armazeno a posição do item que chamou o ContextMenu através do atributo position do objeto itemInfo
        posicao = itemInfo.position;

        //Instancio um objeto do tipo Contato com o item da lista que chamou o ContextMenu, passando a posição do mesmo como parâmetro.
        //O retorno será um Object, então faço um casting para Contato.
        contatoSelecionado = (Contato) getListAdapter().getItem(posicao);

        //Instacio um objeto do tipo Dialog, passando como parâmetro o contato que será deletado
        dialogDeletarContato = createDialogDeletarContato(contatoSelecionado);

        //switch nas opções do ContextMenu (1: Editar | 2: Excluir)
        switch (item.getItemId()){
            case 1:
                //Através de uma Intent, levo as informações do contato selecionado para a tela de edição
                Intent itTelaEditar = new Intent(TelaLista.this, TelaEditar.class);
                itTelaEditar.putExtra("contato", contatoSelecionado);
                startActivity(itTelaEditar);
                break;
            case 2:
                //Exibir o Dialog para confirmar a exclusão do contato
                dialogDeletarContato.show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    //Método para ciar um Dialog que confirmará se o usuário quer deletar o contato
    public Dialog createDialogDeletarContato(final Contato contatoSelecionado){

        //Instancio um objeto Builder, responsável por criar Dialogs e adicionar elementos aos mesmos
        builder = new AlertDialog.Builder(TelaLista.this);

        //Seto uma mensagem ao Dialog
        builder.setMessage("Deletar contato?");

        //Seto o botão "positivo"
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                boolean deletou = contatoDAO.deletar(contatoSelecionado);
                if (deletou){
                    listaContatos.remove(contatoSelecionado);
                    Toast.makeText(TelaLista.this, "Contato deletado", Toast.LENGTH_LONG).show();
                    //Método para "atualizar" o ArrayAdapter, pois um item foi excluído
                    adapterContatos.notifyDataSetChanged();
                }else{
                    Toast.makeText(TelaLista.this, "Deu ruim", Toast.LENGTH_LONG).show();
                }
            }
        });

        //Seto o botão "negativo", que fechará o Dialog
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        //Usando o método create() da classe Builder, retorno um objeto do tipo Dialog
        return builder.create();

    }

}
