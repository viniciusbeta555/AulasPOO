package GestaoProjetos;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private List<Projeto> projetos;
    
    public Cliente(String nome){
        this.nome = nome;
        this.projetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Projeto> getProjetos() {
        return projetos;
    }
    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
    
    public void addProjeto(Projeto projeto){
        projetos.add(projeto);
    }
    public void removerProjeto(Projeto projeto){
        projetos.remove(projeto);
    }
    
    public void listarProjetos(){
        System.out.println("Projetos do ciente "+getNome()+":");
        for(Projeto projeto : projetos){
            System.out.println("- " + projeto.getNome());
        }
    }
    
    
}
