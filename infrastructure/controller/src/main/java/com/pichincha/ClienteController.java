package com.pichincha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clienteController")
public class ClienteController {

    @GetMapping("/status")
    public String status(){
        return "Sizas mi rey";
    }

}
