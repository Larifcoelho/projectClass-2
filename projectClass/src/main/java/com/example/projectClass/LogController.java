package com.example.projectClass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LogController {
    private List<String> logs = new ArrayList<>();

    @PostMapping("/log")
    public String adicionarLog(@RequestBody String evento){
        logs.add(evento);
        return "Log atualizado. Total de eventos: " + logs.size() ;
    }
    @GetMapping ("/listar-eventos")
    public List<String> listar(){
        return logs;
    }
}
