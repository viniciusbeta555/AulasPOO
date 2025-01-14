package SistemaBancario;

public class Conta implements Transacao{

	private String numConta;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(String numConta, Cliente cliente) {
		this.numConta = numConta;
		this.saldo = 0;
		this.cliente = cliente;
	}
	
	public void addValor(double valor) {
		this.saldo += valor;
		System.out.println("Deposito de "+valor+" feito com suesso.");
	}
	
	public void sacarValor(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque de "+valor+" realizado com sucesso.");
		}else {
			System.out.println("Saldo não disponivel.");
		}
	}
	
	public void verificarSaldo() {
		System.out.println("Saldo disponivel: "+this.saldo);
	}
	

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
