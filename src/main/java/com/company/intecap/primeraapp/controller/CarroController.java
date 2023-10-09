package com.company.intecap.primeraapp.controller;

import com.company.intecap.primeraapp.model.Carro;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResponseExtractor;

import java.util.List;

@RestController
@RequestMapping("api/v1")

public class CarroController {
    @GetMapping("/listarCarros")
    public ResponseEntity<List<Carro>> listarCarros(){
        Carro auto1 = new Carro(1, "Mitsubishi", "2018", "azul", "P123ABC",75000);
        Carro auto2 = new Carro(2, "Honda", "2009", "rojo", "P321ABC",40000);
        Carro auto3 = new Carro(3, "Toyota", "2002", "amarillo", "P111FQW",30000);
        Carro auto4 = new Carro(4, "Volkswagen", "2022", "gris", "P098CBA",175000);
        Carro auto5 = new Carro(5, "BMW", "2001", "negro", "P123QWT",22000);

        List<Carro> retorno = List.of(auto1, auto2, auto3, auto4, auto5);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }
}
