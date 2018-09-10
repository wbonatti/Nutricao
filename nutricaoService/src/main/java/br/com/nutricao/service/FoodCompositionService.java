package br.com.nutricao.service;

import java.util.List;

import br.com.nutricao.model.FoodComposition;

public interface FoodCompositionService {
	
	List<FoodComposition> save(final List<FoodComposition> foodComposition);
	
	FoodComposition save(final FoodComposition foodComposition);
		
	List<FoodComposition> findAll();
	
	FoodComposition findById(final String id);
	
	void delete(final String id);
	
	void deleteAll();
}
