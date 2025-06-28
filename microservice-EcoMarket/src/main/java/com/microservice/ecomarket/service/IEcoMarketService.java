package com.microservice.ecomarket.service;

import com.microservice.ecomarket.model.EcoMarket;
import com.microservice.ecomarket.http.response.ProductByEcoMarketResponse;

import java.util.List;

public interface IEcoMarketService {

    List<EcoMarket> findAll();

    EcoMarket findById(Long id);

    void save(EcoMarket ecoMarket);

    void delete(Long id);


    ProductByEcoMarketResponse findProductByIdEcoMarket(Long idEcoMarket);
}
