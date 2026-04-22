// Simulador de Caixa Eletrônico (While + Switch)
//Comece com um double saldo = 1000.0. Crie um menu em um while:
//Ver Saldo
//Depositar
//Sacar (use if para não deixar sacar mais do que tem)
//Sair.

import java.util.Scanner;
public class Exe103_SilumadorDeCaixaEletronico {
    static void main() {
        Scanner leia = new Scanner(System.in);
        double saldo = 1000.0;
        int opcao;
        double deposito;
        double saque = 0.0;
        do {
            System.out.println("-----MENu-----");
            System.out.println("1 - VER SALDO");
            System.out.println("2 - DEPOSITAR");
            System.out.println("3 - SACAR");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Informe a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Seu saldo é de R$: "+ saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser depositado: ");
                    deposito = leia.nextDouble();
                    saldo += deposito;
                    break;

                case 3:
                    System.out.print("Quanto deseja sacar? R$ ");
                    saque = leia.nextDouble();

                    if (saque <= saldo){
                        saldo -= saque;
                        System.out.println("Saque realizado! Retire seu dinheiro.");
                    }else {
                        System.out.println("Saldo insuficiente para esta operação!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema... até logo!");

                default:
                    System.out.println("Opção inválida!");



            }

        }while(opcao != 0);

    }
}
