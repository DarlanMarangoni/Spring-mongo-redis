package br.com.darlan.springmongo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.darlan.springmongo.domain.Cliente;
import br.com.darlan.springmongo.repository.ClienteRepository;
import br.com.darlan.springmongo.service.ClienteService;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository repo;
	
	@Autowired
	private ClienteService service;

	@Override
	public void run(String... args) throws Exception {
		
		repo.deleteAll();
		
		Cliente cli1 = new Cliente(1, "darlan1", "639.439.660-54", "30/05/1990");
		Cliente cli2 = new Cliente(2, "Vanessa", "857.449.420-84", "09/08/1989");
		Cliente cli3 = new Cliente(3, "Leonardo", "749.202.380-45", "01/11/2017");
		
		service.insert(cli1);
		service.insert(cli2);
		service.insert(cli3);
	}

}
