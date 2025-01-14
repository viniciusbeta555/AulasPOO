package SistemaBancario;

import java.util.LinkedList;

public class Cliente {
	
	private String nome;
	private String cpf;
	private LinkedList<Conta> contas;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.contas = new LinkedList<>();
	}
	
	public void addConta(Conta conta) {
		contas.add(conta);
	}
	
	public void removerConta(Conta conta) {
		contas.remove(conta);
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

	public LinkedList<Conta> getContas() {
		return contas;
	}

	public void setContas(LinkedList<Conta> contas) {
		this.contas = contas;
	}
	
	

}
