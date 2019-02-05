package com.springexample.service.dto;

import com.springexample.enumerator.Status;
import com.springexample.enumerator.TipoPessoa;

import java.io.Serializable;
import java.util.Set;

public class PessoaDTO implements Serializable {

    private Long id;
    public TipoPessoa tipoPessoa;
    public String nome;
    public String responsavel;
    public String cargo;
    public String setor;
    public String cpf;
    public String cnpj;
    public String profissao;
    public Status status;
    public Set<EnderecoDTO> enderecos;
    public Set<ContatoDTO> contatos;

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

    public Set<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<EnderecoDTO> enderecos) {
        this.enderecos = enderecos;
    }

    public Set<ContatoDTO> getContatos() {
        return contatos;
    }

    public void setContatos(Set<ContatoDTO> contatos) {
        this.contatos = contatos;
    }
}
