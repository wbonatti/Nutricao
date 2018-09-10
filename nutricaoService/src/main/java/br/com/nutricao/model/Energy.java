package br.com.nutricao.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="energy")
public class Energy {
	
	@Id
	private String id;
	
	private Integer kcal;
	
	private Integer kj;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getKcal() {
		return kcal;
	}

	public void setKcal(Integer kcal) {
		this.kcal = kcal;
	}

	public Integer getKj() {
		return kj;
	}

	public void setKj(Integer kj) {
		this.kj = kj;
	}
	
}
