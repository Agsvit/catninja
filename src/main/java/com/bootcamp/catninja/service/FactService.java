package com.bootcamp.catninja.service;

import com.bootcamp.catninja.repository.FactRepository;

import java.util.Random;

public class FactService {

    final private FactRepository factRepository;

    public FactService(FactRepository factRepository) {
        this.factRepository = factRepository;
    }

    public String getFact() {
        return factRepository.getFactById(new Random().nextInt(factRepository.getFactCount())-1);
    }
}
