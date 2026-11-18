package com.kraemer.arquiteturaspring.montadora.api;

import com.kraemer.arquiteturaspring.montadora.CarroStatus;
import com.kraemer.arquiteturaspring.montadora.Chave;
import com.kraemer.arquiteturaspring.montadora.HondaHRV;
import com.kraemer.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Turbo
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
