public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("___Extrato Conta Poupança (Simples):____");
        imprimirInfosComuns();
    }

    public void imprimirExtratoDetalhado() {
        System.out.println("___Extrato Detalhado Conta Poupança:____");
        imprimirInfosComuns();
        System.out.println(String.format("Nome do Cliente: %s", getCliente().getNome()));
        System.out.println(String.format("CPF: %s", getCliente().getCpf()));
        System.out.println(String.format("Endereço: %s", getCliente().getEndereco()));
        System.out.println(String.format("Rendimentos Mensais: %.2f", getCliente().getRendimentosMensais()));
    }
}




