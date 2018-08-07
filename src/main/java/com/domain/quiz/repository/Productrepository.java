package com.domain.quiz.repository;


import com.domain.quiz.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface Productrepository extends JpaRepository<Product, Long> {
}
