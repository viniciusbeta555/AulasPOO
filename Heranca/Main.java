package Heranca;

public class Main {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Ana", "0123456789", 6000, "02/03/2009", "Contabilidade", 1000);
		
		System.out.println("Nome do gerente: "+gerente1.getNome());
		System.out.println("Salario com bonus: "+gerente1.calcularBonus());
		System.out.println("Gerenciando o departamento de "+gerente1.getDepartamento());
		
		Programador programador1 = new Programador("Maria", "76487432656", 5000, "22/10/2010", "Java", 3);
		System.out.println("-----------------");
		System.out.println("O programador "+programador1.getNome());
		System.out.println("O salario do programador é "+programador1.getSalario());
		programador1.escreverCodigo();
		programador1.revisarCodigo();
		
		Assistente assistente1 = new Assistente("Pedro", "76578366544", 1000, "20/06/2020", "Redes", 20);
		System.out.println("-----------------");
		System.out.println("Nome do assistente: "+assistente1.getNome());
		assistente1.atenderChamadas();
		System.out.println("Salario do assistente : "+assistente1.calcularSalario());
		
		
		System.out.println("-----------------");
		String[] frameworks = {"React", "Angel", "Boot"};
		ProgramadorFrontEnd front1 = new ProgramadorFrontEnd("Jil", "437867685", 5555, "8746368", "Back", 2, "Math", frameworks);
		
		System.out.println("Nome: "+front1.getNome());
		System.out.println("Linguagem principal: "+front1.getLinguagemPrincipal());
		front1.criarInterfaceUsuario();

	}

	
	
	
	
	
	
	
	
}
