package GestaoEscolar;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private int codigo;
    private List<Disciplina> disciplinas;
    
    public Professor(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
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
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void cadastrar(Disciplina disciplina){
        disciplinas.add(disciplina);
        disciplina.addProfessor(this);
        System.out.println("Disciplina " + disciplina.getNome() + " atribuída ao professor " + nome);
    }
    
}
