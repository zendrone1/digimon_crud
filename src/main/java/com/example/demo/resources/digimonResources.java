package com.example.demo.resources;

import com.example.demo.domain.Digimon;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/digimons")
public class digimonResources {
    @RequestMapping(method = RequestMethod.GET)
    public List<Digimon> findAll() {
        Digimon agumon = new Digimon("1", "agumon", "vaccine");
        Digimon impmon = new Digimon("2", "impmon", "virus");
        List<Digimon> list = new ArrayList<>();
        list.addAll(Arrays.asList(agumon, impmon));
        return list;



    }
}
