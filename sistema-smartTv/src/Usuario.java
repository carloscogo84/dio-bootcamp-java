public class Usuario {
    public static void main(String[] args) {
        //Criando ium novo objeto
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println();
        
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> TV desligada? " + smartTv.ligada);

        System.out.println();
        
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canual atual: " + smartTv.canal);

        System.out.println();

        SmartTv smartTv2 = new SmartTv(true, 20, 15);
        System.out.println("SmartTV2: ");
        smartTv2.imprimir();

        System.out.println();

        SmartTv smartTv3 = new SmartTv();
        System.out.println("SmartTV3: ");
        smartTv3.mudarCanal(30);
        smartTv3.imprimir();

    }
    
}
