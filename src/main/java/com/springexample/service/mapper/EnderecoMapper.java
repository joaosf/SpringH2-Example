package com.springexample.service.mapper;

import com.springexample.model.Endereco;
import com.springexample.service.dto.EnderecoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface EnderecoMapper extends EntityMapper<EnderecoDTO, Endereco> {

    EnderecoDTO toDto(Endereco endereco);

    Endereco toEntity(EnderecoDTO enderecoDTO);

    default Endereco fromId(Long id) {
        if (id == null) {
            return null;
        }
        Endereco endereco = new Endereco();
        endereco.setId(id);
        return endereco;
    }
}
