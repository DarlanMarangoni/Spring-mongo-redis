package br.com.darlan.springmongo.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.darlan.springmongo.domain.Cliente;
import br.com.darlan.springmongo.dto.ClienteDTO;
import br.com.darlan.springmongo.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;

	//ou @GetMapping
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ClienteDTO>> findAll(){
		List<Cliente> list = service.findAll();
		List<ClienteDTO> listDTO = list.stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ClienteDTO> findById(@PathVariable String id){
		Cliente cliente = service.findById(id);
		return ResponseEntity.ok().body(new ClienteDTO(cliente));
	}
	
}
