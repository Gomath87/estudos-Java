//Contagem de Pares e Ímpares: Peça para o usuário um número limite.
// Use um for para contar de 1 até esse número. Dentro do laço, use if/else para contar quantos
// são pares e quantos são ímpares. Exiba o total no final.

import java.util.Scanner;
public class Exe52_ContagemDePareseImpares {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int numero;
        int impares = 0;
        int pares = 0;

        System.out.print("Digite um número limite para contagem: ");
        numero = leia.nextInt();

        for (int i = 1; i <= numero; i ++){
            if (i % 2 == 0){
                System.out.println(i+" é Par!");
                pares += 1;
            }else{
                System.out.println(i+" é Ímpar!");
                impares += 1;
            }
        }
        System.out.println();
        System.out.println("Programa finalizado!");
        System.out.println();
        System.out.println("Na contagem dos números de 1 até "+numero+" possuem exato(s): ");
        System.out.println(pares+" números pares!");
        System.out.println(impares+" números ímpares!");
    }
}
