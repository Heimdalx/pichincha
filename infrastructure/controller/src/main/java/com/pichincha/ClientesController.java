package com.pichincha;

import com.pichincha.DTOs.ClienteDTO;
import com.pichincha.interfaces.ClienteUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientesController")
public class ClientesController {

    @Autowired
    private ClienteUseCaseInterface clienteUseCase;

    @GetMapping("/status")
    public String status(){
        return "Sizas mi rey";
    }

    @GetMapping()
    public List<ClienteDTO> GetClientes(){

        return clienteUseCase.getClientes();
    }
}
