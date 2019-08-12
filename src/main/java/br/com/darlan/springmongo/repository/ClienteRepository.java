package br.com.darlan.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.darlan.springmongo.domain.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String>{

}
