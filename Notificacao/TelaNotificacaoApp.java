package Notificacao;

public class TelaNotificacaoApp {
    public static void main(String[] args){
        NotificacaoSms notificacao1 = new NotificacaoSms("Bolo","Farei um bolo hoje a tarde", "(88)9987-6557");
        NotificacaoEmail notificacao2 = new NotificacaoEmail("Entrega de trabalho", "Lembrar de termir o trabalho até a quarta", "vinicius15@gmail.com");
        NotificacaoChamada notificacao3 = new NotificacaoChamada("", "Oi, quando vir a ligação, liga de volta.", "(88) 9346-6493");
    
        notificacao1.emitirSom();
        notificacao1.exibirNotificacao();
        
        notificacao2.emitirSom();
        notificacao2.exibirNotificacao();
        
        notificacao3.emitirSom();
        notificacao3.exibirNotificacao();
    }
    
}
