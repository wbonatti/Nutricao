package br.com.nutricao.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.nutricao.model.Energy;

public interface EnergyRepository extends MongoRepository<Energy, String> {

}
