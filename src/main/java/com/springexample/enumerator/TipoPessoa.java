package com.springexample.enumerator;

public enum TipoPessoa {
    PESSOA_JURIDICA ("Jurídica"),
    PESSOA_FISICA("Física");

    private String descricao;

    TipoPessoa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
