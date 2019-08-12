package br.com.darlan.springmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.darlan.springmongo.domain.Cliente;
import br.com.darlan.springmongo.repository.ClienteRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.deleteAll();
		
		Cliente cli1 = new Cliente("darlan", "123", "30-05-1990");
		Cliente cli2 = new Cliente("Vanessa", "234", "30-05-1990");
		Cliente cli3 = new Cliente("Leonardo", "345", "30-05-1990");
		
		repo.saveAll(Arrays.asList(cli1,cli2, cli3));
	}

}
