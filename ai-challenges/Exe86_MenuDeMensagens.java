//Menu de Mensagens (Switch): Menu com 1-Bom dia, 2-Boa tarde, 3-Boa noite.
// Use switch para imprimir uma mensagem diferente para cada.

import java.util.Scanner;
public class Exe86_MenuDeMensagens {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int opcao;
        System.out.println("Digite uma opção: ");
        opcao = leia.nextInt();

        switch (opcao){

            case 1:
                System.out.println("Bom dia!");
                break;
            case 2:
                System.out.println("Boa tarde!");
                break;
            case 3:
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }
        leia.close();
    }
}
