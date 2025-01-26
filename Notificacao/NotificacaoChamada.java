package Notificacao;

public class NotificacaoChamada extends Notificacao{
    
    private String numeroChamada;

    public NotificacaoChamada(String titulo, String mensagem, String numeroChamada) {
        super(titulo, mensagem);
        this.numeroChamada = numeroChamada;
    }

    @Override
    public void exibirNotificacao() {
        System.out.println("------------------------------");
        System.out.println("Ligação perdida de: "+numeroChamada);
        System.out.println("Caixa-Postal:");
        System.out.println(mensagem);
        System.out.println("------------------------------");
    }

    @Override
    public void emitirSom() {
        System.out.println("------------------------------");
        System.out.println("Som de Chamada: Ligação! Ligação!");
        System.out.println("------------------------------");
    }

    public String getNumeroChamada() {
        return numeroChamada;
    }

    public void setNumeroChamada(String numeroChamada) {
        this.numeroChamada = numeroChamada;
    }
}
