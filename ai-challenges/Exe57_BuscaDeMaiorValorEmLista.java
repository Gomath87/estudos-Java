//Busca de Maior Valor em Lista: Peça ao usuário quantos números ele quer digitar.
// Crie um array desse tamanho. Use um for para preencher.
// Depois, use outro for com if para encontrar o maior valor e em qual posição ele está.

import java.util.Arrays;
import java.util.Scanner;
public class Exe57_BuscaDeMaiorValorEmLista {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int tamanho;
        System.out.print("Quantos números você quer digitar? ");
        tamanho = leia.nextInt();
        int[] lista = new int[tamanho];
        int maior = 0;
        int posicao = 0;

        for (int i = 0; i < lista.length; i++ ){
            System.out.println("Digite o "+(i+1)+("° número: "));
            int numero = leia.nextInt();
            lista[i] = numero;
        }

        for (int i = 0; i < lista.length; i++){
            if( i == 0 ){
                maior = lista[i];
                posicao = i;
            } else if (lista[i] > maior) {
                maior = lista[i];
                posicao = i;
            }
        }
        System.out.println("O maior número digitado foi: "+maior+" e se encontra na posição: "+posicao);
        leia.close();

    }
}
