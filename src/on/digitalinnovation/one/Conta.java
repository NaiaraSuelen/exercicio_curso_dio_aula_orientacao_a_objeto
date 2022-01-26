package on.digitalinnovation.one;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 5000;

    protected Banco banco;
    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Banco banco, Cliente  cliente){
        this.agencia = banco.getAgencia();
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
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

    protected void imprimirInformacoesComuns(){
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("CPF: " + this.cliente.getCPF());
        System.out.println("Banco: " + this.banco.getNome());
        System.out.println(String.format("Agência: %d" , this.agencia));
        System.out.println(String.format("Número: %d" , this.numero));
        System.out.println(String.format("Saldo: %.2f \n" , this.saldo));
    }
}
