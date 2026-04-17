package com.example.projectClass;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DispositivoController {
    @PostMapping("/registrar")
    public String registrar(@RequestBody Dispositivo disp ){
        return"Dispositivo " + disp.getNome() + " registrado na rede com status: " +
        disp.getStatus();
    }
}
