//Adivinhe o Número: O programa escolhe um número (ex: 7). O usuário tenta adivinhar.
// Enquanto ele errar, o programa diz se o número correto é maior ou menor que o chute dele.

import java.util.Scanner;
import java.util.Random;
public class Exe40_AdivinheONumero {
    static void main() {
        Scanner leia = new Scanner(System.in);
        Random gerador = new Random();
        int numeroaleatorio = gerador.nextInt(10) + 1;
        int numero;

        do{
            System.out.print("Informe um número: ");
            numero = leia.nextInt();

            int calculo = numeroaleatorio - numero;
            if (calculo > 0) {
                System.out.println("O número é maior, tente novamente!");
            } else if (calculo < 0) {
                System.out.println("O número é menor, tente novamente!");
            }


        }while(numero != numeroaleatorio );

        System.out.println("Parabéns você acertou o número realmente era: "+numeroaleatorio);

    }
}
