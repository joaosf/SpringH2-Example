package com.springexample.service.mapper;

import com.springexample.model.Pessoa;
import com.springexample.service.dto.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EnderecoMapper.class, ContatoMapper.class})
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {

    PessoaDTO toDto(Pessoa pessoa);

    Pessoa toEntity(PessoaDTO pessoaDTO);

    default Pessoa fromId(Long id) {
        if (id == null) {
            return null;
        }
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        return pessoa;
    }
}
