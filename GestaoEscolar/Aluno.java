package GestaoEscolar;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private List<Disciplina> disciplinas;
    
    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
}
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void matricular(Disciplina disciplina) {
        disciplinas.add(disciplina);
        disciplina.adicionarAluno(this);
        System.out.println("Aluno " + nome + " matriculado na disciplina " + disciplina.getNome());
    }
    
    
    
}
