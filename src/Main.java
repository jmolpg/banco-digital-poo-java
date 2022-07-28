public class Main {
    public static void main(String[] args) {
        Cliente Jessica = new Cliente();
        Jessica.setNome("Jessica");

        Conta cc = new ContaCorrente(Jessica);
        Conta poupanca = new ContaPoupanca(Jessica);

        cc.depositar(139);
        cc.transferir(72, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
