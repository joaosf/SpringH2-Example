package com.springexample.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springexample.enumerator.TipoContato;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "CONTATO")
public class Contato implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "TIPO_CONTATO")
    @Enumerated(EnumType.STRING)
    private TipoContato tipoContato;

    @Column(name = "CONTATO")
    private String contato;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PESSOA_ID", updatable = false)
    @JsonIgnore
    private Pessoa pessoa;

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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
