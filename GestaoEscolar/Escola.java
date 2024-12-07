package GestaoEscolar;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Professor> professores;
    private List<Aluno> alunos;
   
    public Escola(String nome){
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado à escola.");
    }
    public void addProfessor(Professor professor){
        professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " adicionado à escola.");
    }
   
    
}
