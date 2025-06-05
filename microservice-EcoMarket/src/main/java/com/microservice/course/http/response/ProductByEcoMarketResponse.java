package com.microservice.ecomarket.http.response;

import com.microservice.ecomarket.dto.ProductDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class ProductByEcoMarketResponse {
    private String ecoMarketName;
    private String teacher;  // Si aplica
    private List<ProductDTO> productDTOList;
}
