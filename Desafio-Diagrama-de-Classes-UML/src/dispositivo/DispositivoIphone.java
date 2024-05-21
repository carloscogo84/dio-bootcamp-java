package dispositivo;

import equipamento.musica.Reproduzir;
import equipamento.navegador.NavegadorInternet;
import equipamento.telefone.Dispositivo;

public class DispositivoIphone implements Reproduzir, NavegadorInternet, Dispositivo{

    public void tocar() {
        System.out.println("Reproduzindo música via IPhone");
    }
    public void pausar() {
        System.out.println("Pausando música via IPhone");
    }
    public void selecionarMusica() {
        System.out.println("Selecuionando música via IPhone");
    }
    public void pagina() {
        System.out.println("Abrindo página via IPhone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página via IPhone");
    }
    public void atualizar() {
        System.out.println("Atualizando página via IPhone");
    }
    public void ligar() {
        System.out.println("Ligar via IPhone");
    }
    public void atender() {
        System.out.println("Atender via IPhone");
    }
    public void correioVoz() {
        System.out.println("Iniciar correio de voz via IPhone");
    }
}
