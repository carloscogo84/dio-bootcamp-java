package equipamento.navegador;

public class Safari implements NavegadorInternet {

    public void pagina() {
        System.out.println("Abrindo página");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova página");
    }
    public void atualizar() {
        System.out.println("Atualizando página");
    }
    
}
