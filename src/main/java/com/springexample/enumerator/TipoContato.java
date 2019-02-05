package com.springexample.enumerator;

public enum TipoContato {
    EMAIL ("Email"),
    TELEFONE ("Telefone");

    private String descricao;

    TipoContato(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
