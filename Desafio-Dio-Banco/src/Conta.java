public abstract class Conta implements IConta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void depositar(double valor) {
        double valorDepositado = saldo += valor; 
        if(valor <= 0.0){
            System.out.println("Valor inválido para depósito");
        }else{
            System.out.println("Valor depositado: R$ " + valorDepositado);
            
        }
        
    }

    @Override
    public void sacar(double valor) {
        if(saldo < valor){
            System.out.println("Saldo insuficiente para sacar, saldo atual: R$ " + saldo);
        }else{
            saldo -= valor;
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo < valor){
            System.out.println("Saldo insuficiente para transferencia, saldo atual: R$ " + saldo);
        }else{
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transação efetuada com sucesso!");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

}
