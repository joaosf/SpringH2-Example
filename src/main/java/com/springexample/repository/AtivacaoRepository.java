package com.springexample.repository;

import com.springexample.model.Ativacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtivacaoRepository extends JpaRepository<Ativacao, Long> {

}
