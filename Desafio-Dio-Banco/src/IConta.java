public interface IConta {

    //Interface, nada mais é que uma classe abstrata com todos os metodos abstratos

    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, Conta destino);

    void imprimirExtrato();

    
}
