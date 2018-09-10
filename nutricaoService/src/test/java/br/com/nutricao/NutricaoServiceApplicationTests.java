package br.com.nutricao;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.nutricao.model.Energy;
import br.com.nutricao.model.FoodComposition;
import br.com.nutricao.service.FoodCompositionService;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NutricaoServiceApplicationTests {
	
	@Autowired
	FoodCompositionService service;
	
	public static String id = "";

	@Before
	public void beforeTest(){
		Assert.assertNotNull(service);
	}
	
	@Test
	public void testAInsertAll() {
		
		ArrayList<FoodComposition> arrayList = new ArrayList<FoodComposition>();
		arrayList.add(createFoodComposition());
		arrayList.add(createFoodComposition());
		arrayList.add(createFoodComposition());
		
		List<FoodComposition> save = service.save(arrayList);
		
		Assert.assertNotNull(save);
		
		List<FoodComposition> findAll = service.findAll();
		
		Assert.assertEquals(findAll.size(), 3);
		
	}
	
	@Test
	public void testBInsert() {
		
		FoodComposition foodComposition = createFoodComposition();
		
		FoodComposition save = service.save(foodComposition);
		
		Assert.assertNotNull(save);
		Assert.assertEquals(save.getName(), "Teste we");
		
		this.setId(save.getId());
		
		
	}
	
	@Test
	public void testCConsult() {
		
		FoodComposition save = service.findById(this.getId());
		
		Assert.assertNotNull(save);
		Assert.assertEquals(save.getName(), "Teste we");
		
	}
	
	@Test
	public void testDUpdate() {
		
		FoodComposition foodComposition = createFoodComposition();
		foodComposition.setName("outro");
		foodComposition.setId(getId());
		
		FoodComposition save = service.save(foodComposition);
		
		Assert.assertNotNull(save);
		Assert.assertEquals(save.getName(), "outro");
		Assert.assertEquals(save.getId(), this.getId());
		
	}
	
	@Test
	public void testEFindAll(){
		
		List<FoodComposition> findAll = service.findAll();
		
		Assert.assertNotNull(findAll);
		
	}
	
	@Test
	public void testFDelete(){
		
		service.delete(this.getId());
		
		try{
			service.findById(this.getId());
		}catch (NoSuchElementException error) {
			
			Assert.assertEquals(error.getMessage(), "No value present");
		}
		
	}
	
	@Test
	public void testGDeleteAll(){
		
		service.deleteAll();
		
		List<FoodComposition> findAll = service.findAll();
		
		Assert.assertEquals(findAll.size(), 0);
		
	}

	private FoodComposition createFoodComposition() {
		FoodComposition foodComposition = new FoodComposition();
		foodComposition.setAshes(1.2);
		foodComposition.setCalcium(1223);
		foodComposition.setCarbohydrate(0.1);
		foodComposition.setCholesterol(12);
		foodComposition.setCode(1);
		foodComposition.setCopper(1.4);
		foodComposition.setEnergy(new Energy());
		foodComposition.getEnergy().setKcal(12345);
		foodComposition.getEnergy().setKj(222);
		foodComposition.setFiber(12.2);
		foodComposition.setHumidity(1.3);
		foodComposition.setIron(6.2);
		foodComposition.setLipids(2.3);
		foodComposition.setMagnesium(99);
		foodComposition.setName("Teste we");
		foodComposition.setNiacin(3.1);
		foodComposition.setPhosphor(555);
		foodComposition.setPotassium(666);
		foodComposition.setProtein(4.1);
		foodComposition.setPyridoxine(7.1);
		foodComposition.setRae(888);
		foodComposition.setRe(1111);
		foodComposition.setRetinol(567);
		foodComposition.setRiboflavin(98.1);
		foodComposition.setSodium(42);
		foodComposition.setThiamine(87.4);
		foodComposition.setVitaminC(45.6);
		foodComposition.setZinc(01.23);
		
		return foodComposition;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		NutricaoServiceApplicationTests.id = id;
	}
	
	

}
