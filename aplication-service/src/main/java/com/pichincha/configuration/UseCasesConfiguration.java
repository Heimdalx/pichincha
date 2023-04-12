package com.pichincha.configuration;

import com.pichincha.gateways.ClienteRepositoryInterface;
import com.pichincha.interfaces.ClienteConverterInterface;
import com.pichincha.interfaces.ClienteUseCaseInterface;
import com.pichincha.usecases.ClienteUseCase;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfiguration {

    @Bean
    public ClienteUseCaseInterface clienteUseCase(ClienteRepositoryInterface clienteRepository,ClienteConverterInterface clienteConverter) {
        return new ClienteUseCase(clienteRepository,clienteConverter);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
