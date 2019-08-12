package br.com.darlan.springmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.darlan.springmongo.domain.Cliente;
import br.com.darlan.springmongo.dto.ClienteDTO;
import br.com.darlan.springmongo.repository.ClienteRepository;
import br.com.darlan.springmongo.service.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	@Cacheable(cacheNames = "clientes", key = "#root.method.name")
	public List<Cliente> findAll(){
		return repo.findAll();
	}
	
	public Cliente findById(String id) {
		System.out.println(id);
		Optional<Cliente> cliente = repo.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	@CacheEvict(cacheNames = "clientes", allEntries = true)
	public Cliente insert (Cliente obj) {
		return repo.insert(obj);
	}
	
	public Cliente fromDTO(ClienteDTO objDTO) {
		return new Cliente(objDTO.getId(), objDTO.getNome(), 
							objDTO.getCpf(), objDTO.getDataNascimento());
	}
}
