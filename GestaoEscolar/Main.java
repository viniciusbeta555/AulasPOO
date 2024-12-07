
package GestaoEscolar;

public class Main {
    public static void main(String[] args){
        Escola escola1 = new Escola("João Rocha");
        Professor professor1 = new Professor("Pedro Miguel", 12345);
        Aluno aluno1 = new Aluno("Cassio", 98765);
        Aluno aluno2 = new Aluno("Marina", 63946);
        Disciplina disciplina1 = new Disciplina("Matematica", 02056);
        Disciplina disciplina2 = new Disciplina("Ingles", 45689);
        
        escola1.addProfessor(professor1);
        escola1.addAluno(aluno2);
        escola1.addAluno(aluno1);
        
        professor1.cadastrar(disciplina1);
        professor1.cadastrar(disciplina2);
        aluno1.matricular(disciplina1);
        aluno2.matricular(disciplina2);
        
        System.out.println("Total de alunos matriculados na disciplina " + disciplina1.getNome() + ": "+
                disciplina1.totalAlunosMatriculados());
        System.out.println("Total de alunos matriculados na disciplina " + disciplina2.getNome() + ": "+
                disciplina2.totalAlunosMatriculados());
    }
}
