package com.example.projectClass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController  {

    @GetMapping("/pagina")
    public String hello() {
        return "pagina";
    }
}
