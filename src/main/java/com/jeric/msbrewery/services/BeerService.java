package com.jeric.msbrewery.services;

import com.jeric.msbrewery.web.model.BeerDto;
import org.springframework.http.ContentDisposition;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
