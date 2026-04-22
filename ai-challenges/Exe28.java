//1. Preencher e Exibir ao Contrário
//Objetivo: Manipular o índice do for de forma decrescente.
//Desafio: Crie um array de inteiros com 5 posições. Peça ao usuário para preencher os 5 números. Depois, use um segundo for para exibir esses números na ordem inversa (do último para o primeiro).
//Dica: O seu segundo for deve começar em i = array.length - 1 e ir até 0.

import java.util.Scanner;
public class Exe28 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int [] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Informe o "+(i+1)+"° número: ");
            numeros[i] = leia.nextInt();
        }
        System.out.println("Os números informados na ordem inversa são:");
        for ( int i = numeros.length - 1; i >= 0 ; i--) {
            System.out.println(numeros[i]);
        }
    }
}
