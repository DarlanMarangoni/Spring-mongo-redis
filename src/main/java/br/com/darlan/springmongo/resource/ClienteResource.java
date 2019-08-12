package br.com.darlan.springmongo.resource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.darlan.springmongo.domain.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	//ou @GetMapping
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> findAll(){
		Cliente cliente1 = new Cliente("Vanessa", "123", LocalDate.of(1989, 8, 9));
		Cliente cliente2 = new Cliente("Darlan", "456", LocalDate.of(1990, 5, 30));
		Cliente cliente3 = new Cliente("Leonardo", "789", LocalDate.of(2017, 11, 1));
		List<Cliente> list = new ArrayList<>();
		list.addAll(Arrays.asList(cliente1, cliente2, cliente3));
		return ResponseEntity.ok().body(list);
	}
}
