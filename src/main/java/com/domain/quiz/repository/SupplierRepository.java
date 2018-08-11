package com.domain.quiz.repository;


import com.domain.quiz.model.Product;
import com.domain.quiz.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("SupplierRepository")
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
