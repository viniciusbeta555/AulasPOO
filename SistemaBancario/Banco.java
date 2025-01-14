package SistemaBancario;

import java.util.LinkedList;

public class Banco {

	private String nome;
	private LinkedList<Cliente> clientes; 
	
	public Banco(String nome) {
		this.nome = nome;
		this.clientes = new LinkedList<>();
	}
	
	public void addClientes(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		clientes.remove(cliente);
	}
	
	public LinkedList<Cliente> listarClientes() {
		return clientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
