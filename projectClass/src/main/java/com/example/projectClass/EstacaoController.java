package com.example.projectClass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstacaoController {

    @GetMapping("/comodidades")
    public String responder(){
        return "Localização detectada: Setor Norte. Serviços: café e wifi disponíveis. ";
    }
}
