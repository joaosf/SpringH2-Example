package com.springexample.enumerator;

public enum TipoDesconto {
    PERCENTUAL ("Percentual"),
    VALOR("Valor");

    private String descricao;

    TipoDesconto(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
