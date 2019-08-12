package br.com.darlan.springmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.darlan.springmongo.domain.Cliente;
import br.com.darlan.springmongo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	@Cacheable(cacheNames = "clientes", key = "#root.method.name")
	public List<Cliente> findAll(){
		return repo.findAll();
	}
	
}
