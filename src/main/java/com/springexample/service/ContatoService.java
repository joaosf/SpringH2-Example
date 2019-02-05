package com.springexample.service;

import com.springexample.service.dto.ContatoDTO;

import java.util.Optional;

public interface ContatoService {

    /**
     * Save a contato.
     *
     * @param contatoDTO the entity to save
     * @return the persisted entity
     */
    ContatoDTO save(ContatoDTO contatoDTO);

    /**
     * Get the "id" contato.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<ContatoDTO> findOne(Long id);

    /**
     * Delete the "id" contato.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

}
