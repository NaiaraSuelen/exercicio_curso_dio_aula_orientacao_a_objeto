package on.digitalinnovation.one;

import java.util.List;

public class Banco {

    private  String nome = "Bradesco";
    private  int AGENCIA_PADRAO = 1;
    protected List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public int getAgencia(){
        return AGENCIA_PADRAO;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
