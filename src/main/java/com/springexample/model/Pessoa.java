package com.springexample.model;

import com.springexample.enumerator.Status;
import com.springexample.enumerator.TipoPessoa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "PESSOA")
public class Pessoa implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "TIPO_PESSOA")
    @Enumerated(EnumType.STRING)
    public TipoPessoa tipoPessoa;

    @Column(name = "nome")
    public String nome;

    @Column(name = "responsavel")
    public String responsavel;

    @Column(name = "cargo")
    public String cargo;

    @Column(name = "setor")
    public String setor;

    @Column(name = "cpf")
    public String cpf;

    @Column(name = "cnpj")
    public String cnpj;

    @Column(name = "profissao")
    public String profissao;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    public Status status;

    @OneToMany(mappedBy = "pessoa",orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Endereco> enderecos;

    @OneToMany(mappedBy = "pessoa",orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Contato> contatos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Set<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(Set<Contato> contatos) {
        this.contatos = contatos;
    }
}
