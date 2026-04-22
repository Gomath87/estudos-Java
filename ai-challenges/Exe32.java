//5. Multiplicador de Arrays
//Objetivo: Criar um novo array baseado em cálculos de outro.
//
//Desafio: Crie um array A com 5 números. Crie um segundo array B do mesmo tamanho.
// O programa deve preencher o array B de forma que cada posição de B seja o valor de A multiplicado por 2.
// Exiba o array B no final.

import java.util.Arrays;
import java.util.Scanner;
public class Exe32 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int [] lista1 = {1,2,3,4,5};
        int [] lista2 = new int[5];

        for (int i = 0; i < lista1.length; i ++){
            lista2[i] = lista1[i] * 2;
        }
        System.out.println(Arrays.toString(lista2));
    }

}
