    public abstract class Conta implements interfaceConta {
        private static int SEQUENCIAL= 1;
         protected static final int AGENCIA_PADRAO = 1;
         protected int agencia;

         public int getAgencia() {
            return agencia;
         }

         protected int numero;
         public int getNumero() {
         return numero;
    }
    protected double saldo;
    public double getSaldo() {
        return saldo;
    }

    protected Cliente cliente;
    public Conta(Cliente cliente){
        this.cliente = cliente;
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Conta: %d",this.numero));
        System.out.println(String.format("Saldo: R$%.2f\n",this.saldo));
    }


        @Override
        public void sacar(double valor) {
            saldo -= valor;
        }

        @Override
        public void depositar(double valor) {
            saldo += valor;
        }

        @Override
        public void transferir(double valor, Conta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }
