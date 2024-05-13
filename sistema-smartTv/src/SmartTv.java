public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Criação dos metodos
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    //Este novo canal somente é visível neste bloco de método, pois ele é um parametro
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public SmartTv(){

    }
    
    public SmartTv(boolean ligada, int canal, int volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public void imprimir(){
        System.out.println("TV: " + (ligada ? "Ligada" : "Desligada"));
        System.out.println("Canal atual: " + canal);
        System.out.println("Volume atual: " + volume);
    }

}
