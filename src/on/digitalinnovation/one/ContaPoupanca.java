package on.digitalinnovation.one;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    @Override
    public void extrato() {
        System.out.println("***Extrato Conta Poupança***");
        super.imprimirInformacoesComuns();
    }
}



