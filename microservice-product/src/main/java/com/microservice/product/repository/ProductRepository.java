package com.microservice.product.repository;

import com.microservice.product.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

    
    @Query("SELECT s FROM Product s WHERE s.courseId = :idCourse")
    List<Product> findAllProduct(Long idCourse);

    //Query Method
    //List<Product> findAllByCourseId(Long courseId);

}
