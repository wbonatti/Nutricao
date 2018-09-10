package br.com.nutricao.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "foodComposition")
public class FoodComposition {
	
	@Id
	private String id;
	
	private Integer code;
	
	private String name;
	
	private Double humidity;
	
	private Energy energy;
	
	private Double protein;
	
	private Double lipids;
	
	private Integer cholesterol;
	
	private Double carbohydrate;
	
	private Double fiber;
	
	private Double ashes;
	
	private Integer calcium;
	
	private Integer magnesium;
	
	private Double manganese;
	
	private Integer phosphor;
	
	private Double iron;
	
	private Integer sodium;
	
	private Integer potassium;
	
	private Double copper;
	
	private Double zinc;
	
	private Integer retinol;
	
	private Integer re;
	
	private Integer rae;
	
	private Double thiamine;
	
	private Double riboflavin;
	
	private Double pyridoxine;
	
	private Double niacin;
	
	private Double vitaminC;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public Energy getEnergy() {
		return energy;
	}

	public void setEnergy(Energy energy) {
		this.energy = energy;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getLipids() {
		return lipids;
	}

	public void setLipids(Double lipids) {
		this.lipids = lipids;
	}

	public Integer getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(Integer cholesterol) {
		this.cholesterol = cholesterol;
	}

	public Double getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Double getFiber() {
		return fiber;
	}

	public void setFiber(Double fiber) {
		this.fiber = fiber;
	}

	public Double getAshes() {
		return ashes;
	}

	public void setAshes(Double ashes) {
		this.ashes = ashes;
	}

	public Integer getCalcium() {
		return calcium;
	}

	public void setCalcium(Integer calcium) {
		this.calcium = calcium;
	}

	public Integer getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(Integer magnesium) {
		this.magnesium = magnesium;
	}

	public Double getManganese() {
		return manganese;
	}

	public void setManganese(Double manganese) {
		this.manganese = manganese;
	}

	public Integer getPhosphor() {
		return phosphor;
	}

	public void setPhosphor(Integer phosphor) {
		this.phosphor = phosphor;
	}

	public Double getIron() {
		return iron;
	}

	public void setIron(Double iron) {
		this.iron = iron;
	}

	public Integer getSodium() {
		return sodium;
	}

	public void setSodium(Integer sodium) {
		this.sodium = sodium;
	}

	public Integer getPotassium() {
		return potassium;
	}

	public void setPotassium(Integer potassium) {
		this.potassium = potassium;
	}

	public Double getCopper() {
		return copper;
	}

	public void setCopper(Double copper) {
		this.copper = copper;
	}

	public Double getZinc() {
		return zinc;
	}

	public void setZinc(Double zinc) {
		this.zinc = zinc;
	}

	public Integer getRetinol() {
		return retinol;
	}

	public void setRetinol(Integer retinol) {
		this.retinol = retinol;
	}

	public Integer getRe() {
		return re;
	}

	public void setRe(Integer re) {
		this.re = re;
	}

	public Integer getRae() {
		return rae;
	}

	public void setRae(Integer rae) {
		this.rae = rae;
	}

	public Double getThiamine() {
		return thiamine;
	}

	public void setThiamine(Double thiamine) {
		this.thiamine = thiamine;
	}

	public Double getRiboflavin() {
		return riboflavin;
	}

	public void setRiboflavin(Double riboflavin) {
		this.riboflavin = riboflavin;
	}

	public Double getPyridoxine() {
		return pyridoxine;
	}

	public void setPyridoxine(Double pyridoxine) {
		this.pyridoxine = pyridoxine;
	}

	public Double getNiacin() {
		return niacin;
	}

	public void setNiacin(Double niacin) {
		this.niacin = niacin;
	}

	public Double getVitaminC() {
		return vitaminC;
	}

	public void setVitaminC(Double vitaminC) {
		this.vitaminC = vitaminC;
	}
	
}
