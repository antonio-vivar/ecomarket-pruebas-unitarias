package com.microservice.ecomarket.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name="ecomarkets")
@AllArgsConstructor
@NoArgsConstructor
public class EcoMarket  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private String teacher;

}
