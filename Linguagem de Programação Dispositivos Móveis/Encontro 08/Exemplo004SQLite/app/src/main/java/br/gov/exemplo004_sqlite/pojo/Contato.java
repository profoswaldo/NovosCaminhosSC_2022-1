package br.gov.exemplo004_sqlite.pojo;


import java.io.Serializable;

public class Contato implements Serializable {

    private String nome;
    private String id;
    private String email;
    private String telefone;

    public Contato(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "- " + this.nome + "\n- " + this.email + " \n- " +this.telefone;
    }
}

