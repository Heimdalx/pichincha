package com.pichincha.converter;

import com.pichincha.DTOs.ClienteDTO;
import com.pichincha.data.ClienteData;
import com.pichincha.entities.Cliente;
import com.pichincha.interfaces.ClienteConverterInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteConverter implements ClienteConverterInterface {

    @Autowired
    private ModelMapper mapper;


    @Override
    public ClienteDTO toDTO(Cliente cliente) {
        return mapper.map(cliente, ClienteDTO.class);
    }

    @Override
    public Cliente DTOToEntity(ClienteDTO clienteDTO) {
        return mapper.map(clienteDTO, Cliente.class);
    }

    public  Cliente DataToEntity(ClienteData clienteData) {
        return Cliente.builder()
                .id(clienteData.getId())
                .nombre(clienteData.getNombre())
                .genero(clienteData.getGenero())
                .edad(clienteData.getEdad())
                .identificacion(clienteData.getIdentificacion())
                .direccion(clienteData.getDireccion())
                .telefono(clienteData.getTelefono())
                .contrasena(clienteData.getContrasena())
                .estado(clienteData.isEstado())
                .build();

    }
}
