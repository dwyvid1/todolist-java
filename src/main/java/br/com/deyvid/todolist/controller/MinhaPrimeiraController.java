package br.com.deyvid.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }    
}
