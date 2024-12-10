package Heranca;

public class Assistente extends Funcionario{
	private String setor;
	private int cargaHoraria;

	public Assistente(String nome, String cpf, double salario, String dataAdmissao, String setor, int cargaHoraria) {
		super(nome, cpf, salario, dataAdmissao);
		this.cargaHoraria = cargaHoraria;
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public double calcularSalario() {
		return getSalario() * (this.cargaHoraria/10);
	}
	
	public void atenderChamadas() {
		System.out.println("Setor do assistente é "+setor);
	}

}




