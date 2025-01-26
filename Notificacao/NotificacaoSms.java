package Notificacao;

public class NotificacaoSms extends Notificacao {
    
    private String numeroRemetente;

    public NotificacaoSms(String titulo, String mensagem, String numeroRemetente) {
        super(titulo, mensagem);
        this.numeroRemetente = numeroRemetente;
    }

    @Override
    public void exibirNotificacao() {
        System.out.println("------------------------------");
        System.out.println("Mensagem de: "+numeroRemetente);
        System.out.println(mensagem);
        System.out.println("------------------------------");
    }

    @Override
    public void emitirSom() {
        System.out.println("------------------------------");
        System.out.println("Som de SMS: plim! plim!");
        System.out.println("------------------------------");
    }

    public String getNumeroRemetente() {
        return numeroRemetente;
    }

    public void setNumeroRemetente(String numeroRemetente) {
        this.numeroRemetente = numeroRemetente;
    } 
}
