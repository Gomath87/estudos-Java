//Menu de Restaurante (ArrayList + Switch + While)
//Crie um menu: 1- Adicionar Prato, 2- Ver Pedidos, 0- Fechar Conta.
//
//Use o while para manter o programa rodando.
//
//Use o switch para tratar as opções.
//
//Se escolher 1, adicione o nome do prato em um ArrayList.
//
//Se escolher 2, mostre a lista com um for.


import java.util.Scanner;
import java.util.ArrayList;
public class Exe68_MenuDeRestaurante {
    static void main() {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> conta = new ArrayList<>();
        int opcao;
        String prato;


        do {
            System.out.println("-----MENU-----");
            System.out.println();
            System.out.println("1 - Adicionar o nome do prato");
            System.out.println("2 - Ver pedidos");
            System.out.println("0 = Fechar a conta");
            System.out.println("--------------");
            System.out.println();
            System.out.print("Informe a opção desejada: ");
            opcao = leia.nextInt();

            if ((opcao > 2) || (opcao < 0)){
                while ((opcao > 2) || (opcao < 0)){
                    System.out.print("Por faver digite uma opção válida entre 0 e 2: ");
                    opcao = leia.nextInt();
                }
            }

            switch (opcao){

                case 1:

                    leia.nextLine();
                    System.out.print("Informe o nome do prato: ");
                    prato = leia.nextLine();
                    conta.add(prato);
                    System.out.println("Prato adicionado com sucesso!");
                    System.out.println();
                    break;

                case 2:

                    if (conta.isEmpty()){
                        System.out.println("Sua lista de pedidos está vazia!");
                    }else{
                        for (int i = 0; i < conta.size(); i++) {
                            System.out.println((i + 1) + "º - " + conta.get(i));
                        }
                    }
                    System.out.println("-------------------");
                    break;

            }

        }while (opcao != 0);

        System.out.println();
        System.out.println("Obrigado pela presença!");


    }
}
