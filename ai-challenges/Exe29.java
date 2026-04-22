//Localizador de Maior e Menor
//Objetivo: Comparar valores armazenados no array.
//Desafio: Crie um array de 10 números inteiros e preencha-os. Depois, percorra o array para descobrir qual é o maior valor e qual é o menor valor guardado.
//Lógica: Comece supondo que o primeiro elemento (array[0]) é o maior, e compare com os outros dentro do laço.

import java.util.Scanner;
public class Exe29 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int [] numeros = new int [10];

        for (int i = 0; i < numeros.length;i++){
            System.out.println("Informe o "+(i+1)+ "° número: ");
            numeros[i] = leia.nextInt();
        }
        int maior = numeros[0];

        for (int i = 0 ;i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: "+ maior);
        leia.close();
    }
}
