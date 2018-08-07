package com.domain.quiz.service.impl;

import com.domain.quiz.model.Product;
import com.domain.quiz.service.IService;
import  com.domain.quiz.repository.Productrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("productService")
public class ProductServiceImpl implements IService<Product> {
	@Autowired
    Productrepository productRepository;


	@Override
	public List<Product> findAll() {
		return this.productRepository.findAll();
	}

	@Override
	public Product save(Product object) {
		return this.productRepository.save(object);
	}

	@Override
	public Optional<Product> findOne(Long id) {
		return this.productRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
	    this.productRepository.deleteById(id);

	}
}
