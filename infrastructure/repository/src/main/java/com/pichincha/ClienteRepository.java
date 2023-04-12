package com.pichincha;

import com.pichincha.converter.ClienteConverter;
import com.pichincha.entities.Cliente;
import com.pichincha.gateways.ClienteRepositoryInterface;
import com.pichincha.sqlrepository.ClienteCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Repository
public class ClienteRepository implements ClienteRepositoryInterface {

    @Autowired
    ClienteCrudRepository clienteCrud;

    @Autowired
    ClienteConverter clienteConverter;

    @Override
    public List<Cliente> getClientes() {
        return  StreamSupport.stream(clienteCrud.findAll().spliterator(), false)
                .map(clienteConverter::DataToEntity)

                .collect(Collectors.toList());
    }
}
