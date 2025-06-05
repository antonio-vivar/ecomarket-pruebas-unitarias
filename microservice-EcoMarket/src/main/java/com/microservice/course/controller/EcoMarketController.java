package com.microservice.ecomarket.controller;

import com.microservice.ecomarket.model.EcoMarket;
import com.microservice.ecomarket.service.IEcoMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/ecomarket")
public class EcoMarketController {

    @Autowired
    private IEcoMarketService ecoMarketService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEcoMarket(@RequestBody EcoMarket ecoMarket) {
        ecoMarketService.save(ecoMarket);
    }
    
    @GetMapping("/all")
    public ResponseEntity<?> findAllEcoMarkets() {
        return ResponseEntity.ok(ecoMarketService.findAll());
    }
    
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(ecoMarketService.findById(id));
    }
    
    @GetMapping("/search-product/{idEcoMarket}")
    public ResponseEntity<?> findProductByIdEcoMarket(@PathVariable Long idEcoMarket) {
        return ResponseEntity.ok(ecoMarketService.findProductByIdEcoMarket(idEcoMarket));
    }

}
