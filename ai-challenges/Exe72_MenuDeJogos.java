//Menu de Jogos: Crie um menu com 1-Iniciar, 2-Opções, 3-Créditos, 0-Sair.
// Enquanto o usuário não digitar 0, mostre as opções.

import java.util.Scanner;
public class Exe72_MenuDeJogos {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("-----MENU DE JOGOS-----");
            System.out.println();
            System.out.println("1 = INICIAR");
            System.out.println("2 = Opções");
            System.out.println("3 = Créditos");
            System.out.println("0 = Sair");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            opcao = leia.nextInt();

        }while (opcao != 0);

        System.out.println("Até mais!");
    }
}
