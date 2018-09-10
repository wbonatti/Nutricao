package br.com.nutricao.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.nutricao.model.FoodComposition;

public interface FoodCompositionRepository extends MongoRepository<FoodComposition, String>{
	
}
