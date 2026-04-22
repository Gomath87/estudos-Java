//Soma de Array com Filtro (Array + For + If):
//Crie um array de 10 inteiros. Peça para o usuário preencher.
// No final, exiba a soma apenas dos números que forem maiores que 10.

import java.util.Arrays;
import java.util.Scanner;
public class Exe60_SomaDeArrayComFiltro {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int[] lista = new int[10];

        int numero;
        int soma = 0;

        System.out.println("Preencha a lista: ");

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Informe o "+(i+1)+"° número: ");
            numero = leia.nextInt();
            lista[i] = numero;

            if (numero > 10){
                soma += numero;
            }
        }
        System.out.println("A soma dos números na lista que ultrapassam 10 são: "+soma);
    }
}
