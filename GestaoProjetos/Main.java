package GestaoProjetos;

public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Leticia");
        
        Projeto projeto1 = new Projeto("Casa de doces", 1234, cliente1);
        Projeto projeto2 = new Projeto("Projeto B", 8739, cliente1);
        
        Tarefa tarefa1 = new Tarefa("Coletar materiais", projeto1);
        Tarefa tarefa2 = new Tarefa("Pintar a frente", projeto1);
        Tarefa tarefa3 = new Tarefa("Fazer qualquer coisa", projeto2);
        
        Colaborador colaborador1 = new Colaborador("Pedro");
        Colaborador colaborador2 = new Colaborador("Fandango");
        
        tarefa1.addColaborador(colaborador1);
        tarefa2.addColaborador(colaborador2);
        tarefa3.addColaborador(colaborador2);
        
        cliente1.listarProjetos();
        projeto1.listarTarefas();
        projeto2.listarTarefas();
        System.out.println("--------------------");
        
        tarefa1.listarColaboradores();
        tarefa2.listarColaboradores();
        tarefa3.listarColaboradores();
        System.out.println("--------------------");
        
        colaborador1.listarTarefas();
        colaborador2.listarTarefas();
        
        System.out.println("--------------------");
        
        projeto1.listarColaboradores();
       
    }
    
}
