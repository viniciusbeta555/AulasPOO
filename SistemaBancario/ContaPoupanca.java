package SistemaBancario;

public class ContaPoupanca extends Conta{
	
	private double taxa;
	private double retorno;
	
	public ContaPoupanca(String numConta, Cliente cliente, double taxa) {
		super(numConta, cliente);
		this.taxa = taxa;
	}
	
	public void calcularRendimento(int tempo) {
		retorno = (this.saldo * (taxa/100)) * tempo;
		this.saldo += retorno;
		//System.out.println("");
		System.out.println("O seu rendimento foi de: "+retorno+". O saldo apos o rendimento é de: "+this.saldo);
		
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
