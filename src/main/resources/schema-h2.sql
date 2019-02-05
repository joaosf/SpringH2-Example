create table USUARIOS
(
  ID                     NUMBER(10) not null primary key,
  NOME                   VARCHAR2(20 char)
);

    create table ativacao (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        valor decimal(19,2),
        primary key (id)
    );

    create table bairro (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        cidade_id bigint,
        primary key (id)
    );

    create table canal (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        primary key (id)
    );

    create table cidade (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        estado_id bigint,
        primary key (id)
    );

    create table contato (
       id bigint not null,
        contato varchar(255),
        tipo_contato varchar(255),
        pessoa_id bigint,
        primary key (id)
    );

    create table endereco (
       id bigint not null,
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        estado varchar(255),
        latitude varchar(255),
        longitude varchar(255),
        numero varchar(255),
        pais varchar(255),
        rua varchar(255),
        pessoa_id bigint,
        primary key (id)
    );

    create table estado (
       id bigint not null,
        uf varchar(255),
        primary key (id)
    );

    create table faixa_etaria (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        primary key (id)
    );

    create table motivo (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        primary key (id)
    );

    create table operadora (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        primary key (id)
    );

    create table origem (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        primary key (id)
    );

    create table pessoa (
       id bigint not null,
        cargo varchar(255),
        cnpj varchar(255),
        cpf varchar(255),
        nome varchar(255),
        profissao varchar(255),
        responsavel varchar(255),
        setor varchar(255),
        status varchar(255),
        tipo_pessoa varchar(255),
        primary key (id)
    );

    create table plano (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        valor decimal(19,2),
        produto_id bigint,
        velocidade_id bigint,
        primary key (id)
    );

    create table plano_ativacao (
       plano_id bigint not null,
        ativacao_id bigint not null,
        primary key (plano_id, ativacao_id)
    );

    create table produto (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        primary key (id)
    );

    create table promocao (
       id bigint not null,
        desconto decimal(19,2),
        nome varchar(255),
        status varchar(255),
        tipo_desconto varchar(255),
        primary key (id)
    );

    create table tecnologia (
       id bigint not null,
        nome varchar(255),
        status varchar(255),
        primary key (id)
    );

    create table velocidade (
       id bigint not null,
        contato varchar(255),
        tipo_contato varchar(255),
        pessoa_id bigint,
        primary key (id)
    );
    create sequence sequence_generator start with 1 increment by 50;

    alter table bairro
       add constraint FKgmx8his7a51210gcsaunulx8b
       foreign key (cidade_id)
       references cidade;

    alter table cidade
       add constraint FKkworrwk40xj58kevvh3evi500
       foreign key (estado_id)
       references estado;

    alter table contato
       add constraint FKqcaicb387g3yd3xfy44qravfh
       foreign key (pessoa_id)
       references pessoa;

    alter table endereco
       add constraint FKn1l2g0b74rqd9ywu29sva9sy9
       foreign key (pessoa_id)
       references pessoa;

    alter table plano
       add constraint FK3ag5qt0o6sxnt91rsildlso3t
       foreign key (produto_id)
       references produto;

    alter table plano
       add constraint FKbjm1vvg4tnfwe92ibstq0i0dn
       foreign key (velocidade_id)
       references velocidade;

    alter table plano_ativacao
       add constraint FKeby2imw1sgnjx61ebr11gmbtr
       foreign key (ativacao_id)
       references promocao;

    alter table plano_ativacao
       add constraint FKqnend4185c1bj0se1yundcu6i
       foreign key (plano_id)
       references plano;

    alter table velocidade
       add constraint FKmxj04b60xwb8n1mr72kqlqasj
       foreign key (pessoa_id)
       references pessoa;