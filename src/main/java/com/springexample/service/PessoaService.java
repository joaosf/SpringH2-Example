package com.springexample.service;

import com.springexample.service.dto.PessoaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PessoaService {

    /**
     * Save a pessoa.
     *
     * @param pessoaDTO the entity to save
     * @return the persisted entity
     */
    PessoaDTO save(PessoaDTO pessoaDTO);

    /**
     * Get all the pessoas.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<PessoaDTO> findAll(Pageable pageable);

    /**
     * Get all the pessoas.
     *
     * @return the list of entities
     */
    List<PessoaDTO> findAll();

    /**
     * Get the "id" pessoa.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<PessoaDTO> findOne(Long id);

    /**
     * Delete the "id" pessoa.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

}
