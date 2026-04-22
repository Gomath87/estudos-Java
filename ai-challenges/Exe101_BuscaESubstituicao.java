//Busca e Substituição (Array + For + If)
//Crie um array fixo de 10 números inteiros aleatórios.
// Peça para o usuário um "número alvo" e um "número substituto".
//O programa deve percorrer o array, encontrar todas as vezes que o
// "alvo" aparece e trocá-lo pelo "substituto".
//Exiba o array antes e depois.

import java.util.Arrays;
import java.util.Scanner;
public class Exe101_BuscaESubstituicao {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int [] lista = {1, 2, 5, 87, 1, 1 ,5, 55, 77,1};
        int [] lista2 = lista.clone();

        System.out.print("Digite um número Alvo: ");
        int numeroAlvo = leia.nextInt();

        System.out.print("Digite umm número substituto: ");
        int numeroSubs = leia.nextInt();

        for (int i = 0; i < lista.length; i++){

            if (lista[i] == numeroAlvo) {
                lista[i] = numeroSubs;
            }

        }

        System.out.println();   //Espaço para benefício visual!

        System.out.println("LISTA BASE");
        System.out.println("---------------------------");

        for (int i = 0; i < lista2.length; i++){
            System.out.print(lista2[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------------");

        System.out.println();

        System.out.println("LISTA MODIFICADA");
        System.out.println("---------------------------");

        for (int i = 0 ; i < lista.length; i ++){
            System.out.print(lista[i]+" ");
        }
        System.out.println(); //Espaço para benefício visual!
        System.out.println("---------------------------");

        System.out.println(); //Espaço para benefício visual!
        System.out.println(); //Espaço para benefício visual!
        System.out.println("Thank you for using my program!");


    }
}
