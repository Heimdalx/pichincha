package com.pichincha.usecases;

import com.pichincha.DTOs.ClienteDTO;
import com.pichincha.entities.Persona;
import com.pichincha.gateways.ClienteRepositoryInterface;
import com.pichincha.interfaces.ClienteConverterInterface;
import com.pichincha.interfaces.ClienteUseCaseInterface;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteUseCase implements ClienteUseCaseInterface {

    private final ClienteRepositoryInterface clienteRepository;
    private final ClienteConverterInterface clienteConverter;


    public ClienteUseCase(ClienteRepositoryInterface clienteRepository,ClienteConverterInterface clienteConverter) {
        this.clienteRepository = clienteRepository;
        this.clienteConverter = clienteConverter;
    }

    @Override
    public List<ClienteDTO> getClientes() {
        return clienteRepository.getClientes().stream()
                .map(clienteConverter::toDTO)
                .collect(Collectors.toList());
    }
}
