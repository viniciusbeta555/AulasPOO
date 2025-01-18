package SistemaBanco;

public class Main {

	public static void main(String[] args) {
		Banco banco1 = new Banco("Bradesco");
		Cliente cliente1 = new Cliente("Ana", "025.194.676-63");
                Cliente cliente2 = new Cliente("Pedro", "012.456.875-98");
                
		ContaCorrente conta1 = new ContaCorrente("123456789", cliente1, 200);
		ContaPoupanca conta2 = new ContaPoupanca("987654321", cliente1, 5);
                
                ContaPoupanca conta3 = new ContaPoupanca("456986429", cliente2, 10);
		
		banco1.addClientes(cliente1);
                banco1.addClientes(cliente2);
		cliente1.addConta(conta1);
		cliente1.addConta(conta2);
                
                cliente2.addConta(conta3);
		
		conta1.addValor(100);
		conta1.sacarValor(50);
		
		conta2.addValor(100);
		conta2.calcularRendimento(3);
		conta2.verificarSaldo();
                
                conta3.addValor(200);
                conta3.calcularRendimento(3);
                conta3.verificarSaldo();
		
		banco1.listarClientes();		
	}

}
