package br.com.nutricao.facade;

import java.io.File;

import br.com.nutricao.entity.FoodCompositionResponse;

public interface FoodCompositionFacade {
	
	FoodCompositionResponse importFoodComposition(File file);
	 

}
