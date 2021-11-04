package com.jeric.msbrewery.services;

import com.jeric.msbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Beer")
                .beerStyle("Pale Ale")
                .build();
    }
}
