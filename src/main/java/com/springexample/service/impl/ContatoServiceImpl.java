package com.springexample.service.impl;

import com.springexample.model.Contato;
import com.springexample.repository.ContatoRepository;
import com.springexample.service.ContatoService;
import com.springexample.service.dto.ContatoDTO;
import com.springexample.service.mapper.ContatoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ContatoServiceImpl implements ContatoService {

    private final ContatoRepository contatoRepository;
    private final ContatoMapper contatoMapper;

    public ContatoServiceImpl(ContatoRepository contatoRepository, ContatoMapper contatoMapper) {
        this.contatoRepository = contatoRepository;
        this.contatoMapper = contatoMapper;
    }

    /**
     * Save a cntato.
     *
     * @param contatoDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public ContatoDTO save(ContatoDTO contatoDTO) {

        Contato contato = contatoMapper.toEntity(contatoDTO);
        contato = contatoRepository.save(contato);
        return contatoMapper.toDto(contato);
    }

    /**
     * Get one contato by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<ContatoDTO> findOne(Long id) {
//        log.debug("Request to get Bolsas : {}", id);
        return contatoRepository.findById(id)
                .map(contatoMapper::toDto);
    }

    /**
     * Delete the contato by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
//        log.debug("Request to delete Bolsas : {}", id);
        contatoRepository.deleteById(id);
    }

}
