package com.springexample.service.impl;

import com.springexample.model.Pessoa;
import com.springexample.repository.PessoaRepository;
import com.springexample.service.PessoaService;
import com.springexample.service.dto.PessoaDTO;
import com.springexample.service.mapper.PessoaMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;
    private final PessoaMapper pessoaMapper;

    public PessoaServiceImpl(PessoaRepository pessoaRepository, PessoaMapper pessoaMapper) {
        this.pessoaRepository = pessoaRepository;
        this.pessoaMapper = pessoaMapper;
    }

    /**
     * Save a pessoa.
     *
     * @param pessoaDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public PessoaDTO save(PessoaDTO pessoaDTO) {
//        log.debug("Request to save Bolsas : {}", bolsasDTO);

        Pessoa pessoa = pessoaMapper.toEntity(pessoaDTO);
        pessoa = pessoaRepository.save(pessoa);
        return pessoaMapper.toDto(pessoa);
    }

    /**
     * Get all the bolsas.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<PessoaDTO> findAll(Pageable pageable) {
//        log.debug("Request to get all Bolsas");
        return pessoaRepository.findAll(pageable)
                .map(pessoaMapper::toDto);
    }

    /**
     * Get all the bolsas.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<PessoaDTO> findAll() {
//        log.debug("Request to get all Bolsas");
        return StreamSupport
                .stream(pessoaRepository.findAll().spliterator(), false)
                .map(pessoaMapper::toDto)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one pessoa by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<PessoaDTO> findOne(Long id) {
//        log.debug("Request to get Bolsas : {}", id);
        return pessoaRepository.findById(id)
                .map(pessoaMapper::toDto);
    }

    /**
     * Delete the pessoa by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
//        log.debug("Request to delete Bolsas : {}", id);
        pessoaRepository.deleteById(id);
    }

}
