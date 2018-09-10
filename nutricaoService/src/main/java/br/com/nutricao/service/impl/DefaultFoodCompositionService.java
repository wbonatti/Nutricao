package br.com.nutricao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import br.com.nutricao.dao.FoodCompositionRepository;
import br.com.nutricao.model.FoodComposition;
import br.com.nutricao.service.FoodCompositionService;

@Service
public class DefaultFoodCompositionService implements FoodCompositionService {

	private static final String FOOD_COMPOSITION_NULL_ERROR = "FoodComposition can not be null";
	
	@Autowired
	FoodCompositionRepository foodCompositionRepository;
	
	@Override
	public List<FoodComposition> save(final List<FoodComposition> foodComposition){
			
			Assert.notEmpty(foodComposition, FOOD_COMPOSITION_NULL_ERROR);
			
			List<FoodComposition> save = foodCompositionRepository.saveAll(foodComposition);
			
			return save;
			
	}

	@Override
	public FoodComposition save(final FoodComposition foodComposition) {
		
		Assert.notNull(foodComposition, FOOD_COMPOSITION_NULL_ERROR);
		
		FoodComposition save = foodCompositionRepository.save(foodComposition);
		
		return save;
	}

	@Override
	public List<FoodComposition> findAll() {
		
		return foodCompositionRepository.findAll();
	}

	@Override
	public FoodComposition findById(final String id) {

		return foodCompositionRepository.findById(id).get();
	}

	@Override
	public void delete(final String id) {
		
		Assert.hasText(id, FOOD_COMPOSITION_NULL_ERROR);
		
		foodCompositionRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		
		foodCompositionRepository.deleteAll();
		
	}
	
	
}
