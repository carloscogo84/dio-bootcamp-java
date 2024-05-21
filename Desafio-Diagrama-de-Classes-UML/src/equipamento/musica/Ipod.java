package equipamento.musica;

public class Ipod implements Reproduzir {

    public void tocar() {
        System.out.println("Tocanso música");
    }
    public void pausar() {
        System.out.println("Pausando música");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}