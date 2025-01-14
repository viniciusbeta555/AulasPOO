package SistemaBancario;

public class ContaCorrente extends Conta{
	
	private double limite;

	public ContaCorrente(String numConta, Cliente cliente, double limite) {
		super(numConta, cliente);
		this.limite = limite;
	}
	
	@Override
	public void sacarValor(double valor) {
		if(valor <= limite && valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque de "+valor+" realizado com sucesso.");
		}else {
			System.out.println("Valor ou limite de saque insuficiente.");
		}
	}

}
