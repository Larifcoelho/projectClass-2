package com.example.projectClass;

import org.springframework.web.bind.annotation.*;

@RestController
public class EstacaoController {

    @GetMapping("/comodidades")
    public String responder() {
        return "Localização detectada: Setor Norte. Serviços: café e wifi disponíveis. ";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Sistema Operacional detectado. Middleware Spring Boot em operação. ";
    }

    @GetMapping("/identificar")
    public String identificar(@RequestParam String nome) {
        return "Olá, " + nome + " você está conectado a um nó autônomo do sistema! ";
    }

    @GetMapping("/watch")
    public String getVideo(@RequestParam String v,
                           @RequestParam String t) {
        return "Vídeo tocando: " + v + " no tempo " + t + "s";
    }

    @GetMapping("/soma")
    public String somar(@RequestParam int a, @RequestParam int b) {
        int resultado = a + b;
        return "O processamento do servidor resultou em: " + resultado;
    }

    @PostMapping("/enviar")
    public String receber(@RequestBody String mensagem) {
        return "Middleware confirmou: mensagem " + mensagem + " foi recebida com sucesso!";
    }

    @PostMapping("/sensor")
    public String capturarTemperatura(@RequestBody double temperatura) {
        if (temperatura >= 30) {
            return "Alerta de Sistema: Temperatura " + temperatura + "°C acima do limite! ";
        }
        return "Dados do sensor registrados: " + temperatura + "°C";


    }
}