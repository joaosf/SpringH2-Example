package com.springexample.model;

import com.springexample.enumerator.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;


@Entity
@Table(name = "PLANO")
public class Plano implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUTO_ID", updatable = false)
    private Produto produto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "VELOCIDADE_ID", updatable = false)
    private Velocidade velocidade;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="PLANO_ATIVACAO", joinColumns=@JoinColumn(name="PLANO_ID"), inverseJoinColumns=@JoinColumn(name="ATIVACAO_ID"))
    private Set<Ativacao> ativacoes;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="PLANO_ATIVACAO", joinColumns=@JoinColumn(name="PLANO_ID"), inverseJoinColumns=@JoinColumn(name="ATIVACAO_ID"))
    private Set<Promocao> promocoes;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Velocidade getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Velocidade velocidade) {
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Set<Ativacao> getAtivacoes() {
        return ativacoes;
    }

    public void setAtivacoes(Set<Ativacao> ativacoes) {
        this.ativacoes = ativacoes;
    }

    public Set<Promocao> getPromocoes() {
        return promocoes;
    }

    public void setPromocoes(Set<Promocao> promocoes) {
        this.promocoes = promocoes;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
