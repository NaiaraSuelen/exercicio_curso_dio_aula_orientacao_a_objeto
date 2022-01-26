package on.digitalinnovation.one;

public class ContaCorrente extends Conta{

    public ContaCorrente(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    @Override
    public void extrato() {
        System.out.println("***Extrato Conta Corrente***");
        super.imprimirInformacoesComuns();
    }
}
