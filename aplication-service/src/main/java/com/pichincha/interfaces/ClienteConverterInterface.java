package com.pichincha.interfaces;

import com.pichincha.DTOs.ClienteDTO;
import com.pichincha.entities.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteConverterInterface {

     ClienteDTO toDTO(Cliente cliente);

     Cliente DTOToEntity(ClienteDTO clienteData);
}
