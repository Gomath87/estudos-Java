//Array de Idades: Crie um array fixo de 3 posições, peça 3 idades e imprima cada uma usando um for.

import java.util.Scanner;
import java.util.Arrays;
public class Exe84_ArrayDeIdades {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int[] lista = new int[3];

        int idade;

        for (int i = 0; i < 3; i++){
            System.out.print("Informe a "+(i+1)+"° idade: ");
            idade = leia.nextInt();
            lista[i] = idade;

        }

        for (int i = 0; i < lista.length; i++){
            System.out.println((i+1)+"° idade: "+lista[i]);
        }
        leia.close();
    }
}
