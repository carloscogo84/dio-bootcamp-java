package loja;

import dispositivo.DispositivoIphone;
import equipamento.musica.Reproduzir;
import equipamento.navegador.NavegadorInternet;
import equipamento.telefone.Dispositivo;

public class Usuario {
    public static void main(String[] args) {
        DispositivoIphone iphone = new DispositivoIphone();
        Reproduzir musica = (Reproduzir) iphone;
        Dispositivo telefone = (Dispositivo) iphone;
        NavegadorInternet internet = (NavegadorInternet) iphone;

        System.out.println("Música");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        
        System.out.println();

        System.out.println("Telefone");
        telefone.ligar();
        telefone.atender();
        telefone.correioVoz();

        System.out.println();

        System.out.println("Internet");
        internet.pagina();
        internet.adicionarNovaAba();
        internet.atualizar();

        System.out.println();
    }
}
