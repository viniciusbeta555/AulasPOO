package GestaoProjetos;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String nome;
    private Projeto projeto;
    private List<Colaborador> colaboradores;
    
    public Tarefa(String nome, Projeto projeto){
        this.nome = nome;
        this.projeto = projeto;
        this.colaboradores = new ArrayList<>();
        projeto.addTarefa(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

 
    
    public void addColaborador(Colaborador colaborador){
        colaboradores.add(colaborador);
        colaborador.addTarefas(this);
    }
    
    public void listarColaboradores(){
        System.out.println("Colaboradores do projeto "+projeto.getNome()+" :");
        for(Colaborador colaborador : colaboradores){
            System.out.println("- "+colaborador.getNome());
        }
    }
    
}
