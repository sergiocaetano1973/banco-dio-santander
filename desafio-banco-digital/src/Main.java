public class Main {
    public static void main(String[] args) {
        Cliente sergio = new Cliente("Sergio", "12345678900", "Rua A, 123", 5000.0, "senha123");

        ContaCorrente cc = new ContaCorrente(sergio);
        cc.depositar(100);

        ContaPoupanca poupanca = new ContaPoupanca(sergio);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        cc.imprimirExtratoDetalhado();

        poupanca.imprimirExtrato();
        poupanca.imprimirExtratoDetalhado();
    }
}



