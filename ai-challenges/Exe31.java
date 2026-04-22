//4. Separador de Pares e Ímpares
//Objetivo: Aplicar lógica de if dentro da leitura do array.
//Desafio: Crie um array de 10 números. Ao final, percorra o array e exiba apenas os números que são pares. Depois, percorra novamente e exiba apenas os ímpares.

import java.util.Scanner;
public class Exe31 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Numeros Pares: ");
        for (int i = 0; i < numeros.length; i ++){
            if (numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Números Ímpares: ");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 != 0){
                System.out.println(numeros[i]);
            }
        }
    }
}

