
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Jorge da Silva";
        String tipoConta = "Corrente";
        double saldo = 3500.99;
        int opcao = 0;
        String menu = """

                /-------DIGITE A OPÇÃO-------/

                    1 - Consultar o saldo
                    2 - Saque
                    3 - Transferir
                    4 - Sair


                /---------------------------/

                    """;

        System.out.println("\n /---------------------------------/");
        System.out.println("\n Nome do cliente: " + nome);
        System.out.println("\n Tipo de conta: " + tipoConta);
        System.out.println("\n Saldo Atual R$: " + saldo);
        System.out.println("\n /---------------------------------/");

        Scanner sc = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println(menu);
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja sacar?");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("OPÇÃO INVALIDA!");
            }
        }
    }
}