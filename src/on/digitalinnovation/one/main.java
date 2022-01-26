package on.digitalinnovation.one;

import java.util.List;

public class main {
    public static void main(String [] args){

        Banco bradesco = new Banco();
        Cliente maria = new Cliente("Maria", "4756788893");

        Conta cc = new ContaCorrente(bradesco,maria);
        Conta poupanca = new ContaPoupanca(bradesco,maria);

        poupanca.saldo = 1200;
        cc.saldo = 2200;
        cc.extrato();
        poupanca.extrato();

    }
}
