package com.domain.quiz.service.impl;

import com.domain.quiz.model.Product;
import com.domain.quiz.model.Supplier;
import com.domain.quiz.repository.Productrepository;
import com.domain.quiz.repository.SupplierRepository;
import com.domain.quiz.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("supplierService")
public class SupplierServiceImpl implements IService<Supplier> {
	@Autowired
	SupplierRepository supplierRepository;


	@Override
	public List<Supplier> findAll() {
		return this.supplierRepository.findAll();
	}

	@Override
	public Supplier save(Supplier object) {
		return this.supplierRepository.save(object);
	}

	@Override
	public Optional<Supplier> findOne(Long id) {
		return this.supplierRepository.findById(id);

	}

	@Override
	public void delete(Long id) {

	}
}
