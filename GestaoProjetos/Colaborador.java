package GestaoProjetos;

import java.util.ArrayList;
import java.util.List;

public class Colaborador {
    private String nome;
    private List<Tarefa> tarefas;
    
    public Colaborador(String nome){
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public void addTarefas(Tarefa tarefa){
        tarefas.add(tarefa);
    }
    public void listarTarefas(){
        System.out.println("Tarefas do colaborador "+getNome()+" :");
        for (Tarefa tarefa : tarefas) {
            System.out.println("- " + tarefa.getNome());
        }
    }
    
    
}
