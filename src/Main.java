public class Main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); //instancia novo banco

        bancoInicial.setNome("Santander"); //insere nome do banco

        Cliente debora = new Cliente("Debora", bancoInicial);  //criado novo cliente debora
        debora.setNome("Debora Quaresma da Silva"); //insere o nome do cliente

        Conta ccorrente = new ContaCorrente(debora); //instanciada nova conta corrente

        ccorrente.depositar(100); //criado um deposito em conta corrente

        Cliente hugo = new Cliente("Hugo", bancoInicial);  //instancia novo cliente
        Conta cpoupanca = new ContaPoupanca(hugo);  //instanciada nova conta poupanca

        ccorrente.imprimirExtrato();  //imprime extrato de ccorrente debora
        cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca hugo

        ccorrente.transferir(48, cpoupanca);  //faz transferencia de ccorrente debora pra cpoupanca hugo

        ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente debora
        cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca hugo
        bancoInicial.mostrarClientes(); //mostra lista de clientes

        Cliente paulo = new Cliente("Paulo", bancoInicial);  //instancia novo cliente paulo
        Conta ccorrente2 = new ContaCorrente(paulo); //instancia nova ccorrente2 de paulo
        ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de paulo
        bancoInicial.mostrarClientes(); //mostra lista atualizada de clientes do banco
    }

}
