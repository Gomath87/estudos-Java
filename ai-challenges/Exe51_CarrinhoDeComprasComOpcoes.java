//Carrinho de Compras com Opções: Crie um ArrayList<String>.
// Use um while com um menu: 1-Adicionar item, 2-Ver lista, 3-Sair.
// Se escolher 1, peça o nome do item. Se escolher 2, use um for para listar.

import java.util.ArrayList;
import java.util.Scanner;
public class Exe51_CarrinhoDeComprasComOpcoes {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        ArrayList<String> carrinho = new ArrayList<>();

        int menu ;
        String produto;

        System.out.println("---------MENU---------");
        System.out.println("1 - ADICIONAR PRODUTO");
        System.out.println("2 - VER LISTA");
        System.out.println("3 - FINALIZAR A LISTA");
        System.out.println("----------------------");
        System.out.print("Informe a opção desejada: ");
        menu = leia.nextInt();
        leia.nextLine();

        while (menu != 3) {

            // If e While para verificar e repetir caso necessário para
            // a validação da opção escolhida do MENU que precisa ser um número entre 1 a 3.
            if ((menu < 1) || (menu > 3)) {
                while ((menu < 1) || (menu > 3)) {
                    System.out.println("Por favor informe uma opção válida (1,2 ou 3): ");
                    menu = leia.nextInt();
                    leia.nextLine();
                }
            }

            if (menu == 1) {
                System.out.print("Informe o produto a ser adicionado: ");
                produto = leia.nextLine();
                carrinho.add(produto);
                System.out.println("Produto '" + produto + "' Adicionado!");
                System.out.println();

            } else if (menu == 2) {
                System.out.println("LISTA ATUAL");
                // for para mostrar a lista de forma organizada!
                for (int i = 0; i < carrinho.size(); i++) {
                    System.out.println((i + 1) + " - " + carrinho.get(i));
                }
                System.out.println();
            }


            System.out.println("---------MENU---------");
            System.out.println("1 - ADICIONAR PRODUTO");
            System.out.println("2 - VER LISTA");
            System.out.println("3 - FINALIZAR A LISTA");
            System.out.println("----------------------");
            System.out.print("Informe a opção desejada: ");


            menu = leia.nextInt();
            leia.nextLine();


        }
        System.out.println("LISTA FINAL ATUALIZADA: ");
        // for para mostrar a lista de forma organizada!
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println((i + 1) + " - " + carrinho.get(i));
        }
        leia.close();
    }
}
