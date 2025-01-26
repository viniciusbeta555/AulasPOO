package Notificacao;

public class NotificacaoEmail extends Notificacao {
    
    private String remetenteEmail;

    public NotificacaoEmail(String titulo, String mensagem, String remetenteEmail) {
        super(titulo, mensagem);
        this.remetenteEmail = remetenteEmail;
    }

    @Override
    public void exibirNotificacao() {
        System.out.println("------------------------------");
        System.out.println("De: "+remetenteEmail);
        System.out.println("Titulo: "+titulo);
        System.out.println(mensagem);
        System.out.println("------------------------------");
    }

    @Override
    public void emitirSom() {
        System.out.println("------------------------------");
        System.out.println("Som de E-mail: tun tun! tun tun!");
        System.out.println("------------------------------");
    }

    public String getRemetenteEmail() {
        return remetenteEmail;
    }

    public void setRemetenteEmail(String remetenteEmail) {
        this.remetenteEmail = remetenteEmail;
    }
}
