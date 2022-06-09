package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    Integer number = 1;
    @GetMapping("")
     public Integer getUsers() {
        return number;
    }

    @GetMapping("/parametro/{id}")
    public Integer getEnteros(@PathVariable Integer id) {
        return id;
    }
}
