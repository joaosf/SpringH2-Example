package com.springexample.service.dto;

import com.springexample.enumerator.TipoContato;

import java.io.Serializable;

public class ContatoDTO implements Serializable {

    private Long id;
    private TipoContato tipoContato;
    private String contato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
