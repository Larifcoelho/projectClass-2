package com.example.projectClass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstacaoController {

    @GetMapping("/comodidades")
    public String responder(){
        return "Localização detectada: Setor Norte. Serviços: café e wifi disponíveis. ";
    }
    @GetMapping("/status")
    public String getStatus(){
        return "Sistema Operacional detectado. Middleware Spring Boot em operação. ";
    }
    @GetMapping("/identificar")
    public String identificar(@RequestParam String nome){
        return "Olá, " + nome + " você está conectado a um nó autônomo do sistema! ";
    }
    @GetMapping("/watch")
    public String getVideo(@RequestParam String v,
                           @RequestParam String t){
        return "Vídeo tocando: " + v + " no tempo " + t + "s";
    }

}
