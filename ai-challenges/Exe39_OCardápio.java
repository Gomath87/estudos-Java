//O Cardápio: Exiba um menu: 1. Café, 2. Chá, 3. Sair.
// Enquanto o usuário não escolher a opção 3, o programa deve processar a escolha e mostrar o menu novamente.

import java.util.Scanner;
public class Exe39_OCardápio {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("-----CARDÁPIO-----");
        System.out.println();
        System.out.println("1 - Café");
        System.out.println("2 - Chá");
        System.out.println("3 - Sair");
        System.out.println();

        int senha = leia.nextInt();
        while (senha != 3){

            if (senha == 1){
                System.out.println("Você escolheu um café!");
                System.out.println();
            } else if (senha == 2) {
                System.out.println("Você escolheu Chá");
                System.out.println();
            }

            System.out.println("-----CARDÁPIO-----");
            System.out.println();
            System.out.println("1 - Café");
            System.out.println("2 - Chá");
            System.out.println("3 - Sair");
            System.out.println();

            senha = leia.nextInt();
        }
        System.out.println("Foi um prazer atende-lo");
        leia.close();
    }
}
