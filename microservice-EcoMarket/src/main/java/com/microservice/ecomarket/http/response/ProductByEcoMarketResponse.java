package com.microservice.ecomarket.http.response;

import java.util.List;

import com.microservice.ecomarket.dto.ProductDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class ProductByEcoMarketResponse {
    private String ecoMarketName;
    private String teacher;  // Si aplica
    private List<ProductDTO> productDTOList;
}
