//Sistema de Conta Bancária (Saque e Depósito)
//Classe Conta: Atributos titular e saldo. Métodos depositar(valor) e sacar(valor).
// No saque, use if para não deixar o saldo ficar negativo.
//
//No Main: Use um while com um menu: 1-Depositar, 2-Sacar, 3-Ver Saldo, 0-Sair.
// Peça os valores pelo Scanner.


import java.util.Scanner;
public class Exe130_SistemaContaBancaria {
    static void main() {
        Scanner leia = new Scanner(System.in);
        Conta dados = new Conta("Matheus",70000000);

        int op;

        do {
            System.out.println();
            System.out.println("----------MENU----------");
            System.out.println();
            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Ver Saldo");
            System.out.println("0-Sair");
            System.out.println("------------------------");
            System.out.println();
            System.out.print("Informe a opção desejada : ");
            op = leia.nextInt();

            switch (op){  //Switch para facilitar possíveis alterações futuras!

                case 1:
                    System.out.print("Informe o valor do depósito: ");
                    float deposito = leia.nextFloat();
                    dados.depositar(deposito);   //Chama o método de depósito
                    break;

                case 2:
                    System.out.println("Informe o valor do saque: ");
                    float saque = leia.nextFloat();
                    dados.sacar(saque);         //Chama o método de saque
                    break;

                case 3:
                    dados.saldo();
                    break;

                case 0:
                    System.out.println("Finalizando o sistema...");
                    break;

                default:
                    System.out.println("Por favor informe um opção válida!");
                    System.out.println();       //Caso o usuário digite um número fora das opções válidas
                    break;

            }

        }while (op != 0);

        System.out.println();
        System.out.println("Obrigado por usar nossos serviços!");
    }
}


class Conta {
    String titular; //Objeto
    float saldo;  //Objeto
    public Conta (String nome, float valor){
        this.titular = nome;
        this.saldo = valor;
    }
    public void depositar (float valor){      //Método que vai realizar o processo de depósito!
        // Validando se o depósito é positivo
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    public void sacar (float valor){        //Método que vai realizar o processo de saque!
        if (saldo < valor){                 //If para evitar que o usuário tente sacar além do saldo disponível
            System.out.println("Saldo insuficiente para saque!");
        }else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n",valor);
        }
        }
    public void saldo (){                   //Método que vai realizar o processo de mostrar o sdaldo em conta!
        System.out.println("Consultando Saldo...");
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n", titular, saldo);
    }
}