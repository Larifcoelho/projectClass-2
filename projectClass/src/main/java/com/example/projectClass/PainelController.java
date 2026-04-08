package com.example.projectClass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PainelController {

    @GetMapping("/painel")
    public String getPainel(){
        return "painel";
    }
}
