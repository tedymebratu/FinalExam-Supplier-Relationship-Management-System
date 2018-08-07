package com.domain.quiz.service;



import java.util.List;
import java.util.Optional;

public interface IService<T> {
	 List<T> findAll();
	 T save(T object);
	 Optional<T> findOne(Long id);
	 void delete(Long id);
}
