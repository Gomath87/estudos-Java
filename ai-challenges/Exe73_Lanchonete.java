//Lanchonete: Peça o código de um item (100: Cachorro-quente, 101: Bauru, 102: X-Salada).
// Imprima o nome do item escolhido.

import java.util.Scanner;
public class Exe73_Lanchonete {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int pedido;

        System.out.print("Informe o código do pedido: ");
        pedido = leia.nextInt();

        switch (pedido){

            case 100:
                System.out.println("Você escolheu Cachorro-Quente!");
                break;
            case 101:
                System.out.println("Você escolheu Bauru");
                break;
            case 102:
                System.out.println("Você escolheu X - Salada");
                break;
            default:
                System.out.println("Código do pedido inválido!");
                break;
        }

    }
}
