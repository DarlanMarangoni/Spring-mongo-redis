package br.com.darlan.springmongo;

import br.com.darlan.springmongo.domain.Cliente;

public class ClienteDTO {

	private String _id;
	private String nome;
	private String cpf;
	private String dataNascimento;
	
	public ClienteDTO() {
		
	}
	
	public ClienteDTO (Cliente cliente) {
		this._id = cliente.get_id();
		this.nome = cliente.getNome();
		this.cpf = cliente.getCpf();
		this.dataNascimento = cliente.getDataNascimento();
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
