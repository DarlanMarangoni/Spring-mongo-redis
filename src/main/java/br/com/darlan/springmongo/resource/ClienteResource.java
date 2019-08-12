package br.com.darlan.springmongo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.darlan.springmongo.domain.Cliente;
import br.com.darlan.springmongo.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;

	//ou @GetMapping
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
