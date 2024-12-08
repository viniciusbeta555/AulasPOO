package GestaoProjetos;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private int id;
    private List<Tarefa> tarefas;
    private Cliente cliente;
    
    public Projeto(String nome, int id, Cliente cliente){
        this.nome = nome;
        this.id = id;
        this.tarefas = new ArrayList<>();
        cliente.addProjeto(this);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public void addTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }
    public void removerTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
    }
    public void listarTarefas(){
        System.out.println("Tarefas do projeto "+getNome()+" :");
        for(Tarefa tarefa : tarefas){
            System.out.println("- "+ tarefa.getNome());
        }
    }
    public void listarColaboradores() {
        for (Tarefa tarefa : tarefas) {
            tarefa.listarColaboradores();
        }
    }
}
