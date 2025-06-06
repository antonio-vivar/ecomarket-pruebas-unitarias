package com.microservice.ecomarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservice.ecomarket.model.EcoMarket;
import com.microservice.ecomarket.service.IEcoMarketService;

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
