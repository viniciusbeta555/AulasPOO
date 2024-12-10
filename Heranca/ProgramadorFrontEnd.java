package Heranca;

public class ProgramadorFrontEnd extends Programador{
	private String bibliotecaPreferida;
	private String[] frameworksDominados;
	
	public ProgramadorFrontEnd(String nome, String cpf, double salario, String dataAdmissao, String linguagemPrincipal, int projetosEmAndamento, String bibliotecaPreferida, String[] frameworksDominados) {
		super(nome, cpf, salario, dataAdmissao, linguagemPrincipal, projetosEmAndamento);
		this.bibliotecaPreferida = bibliotecaPreferida;
		this.frameworksDominados = frameworksDominados;
	}

	public String getBibliotecaPreferida() {
		return bibliotecaPreferida;
	}

	public void setBibliotecaPreferida(String bibliotecaPreferida) {
		this.bibliotecaPreferida = bibliotecaPreferida;
	}

	public String[] getFrameworksDominados() {
		return frameworksDominados;
	}

	public void setFrameworksDominados(String[] frameworksDominados) {
		this.frameworksDominados = frameworksDominados;
	}
	
	public void criarInterfaceUsuario() {
		System.out.println(super.getNome()+" Criando interface nos frameworks "+this.getFrameworksDominados());
	}
}
