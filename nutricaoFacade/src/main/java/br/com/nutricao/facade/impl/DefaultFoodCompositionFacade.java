package br.com.nutricao.facade.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.nutricao.entity.FoodCompositionResponse;
import br.com.nutricao.facade.FoodCompositionFacade;
import br.com.nutricao.service.FoodCompositionService;

public class DefaultFoodCompositionFacade implements FoodCompositionFacade{
	
	@Autowired
	FoodCompositionService compositionService;

	@Override
	public FoodCompositionResponse importFoodComposition(File file) {
		
		
		return null;
	}
	

}
