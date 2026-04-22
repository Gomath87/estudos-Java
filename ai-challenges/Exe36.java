//int contador = 0; // 1. Inicialização fora
//
//while (contador < 5) { // 2. Condição de parada
//    System.out.println("Contando... " + contador);
//
//    contador++; // 3. Incremento MANUAL (se esquecer, o loop fica infinito!)

//O "Até que Enjoe": Crie um programa que peça para o usuário digitar um número.
// O programa deve continuar pedindo números enquanto o número digitado for diferente de 0.
// Quando ele digitar 0, mostre a soma de todos os números anteriores.

import java.util.Scanner;
public class Exe36 {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Informe um número (0 para sair): ");
            numero = leia.nextInt();

            soma += numero;

        } while (numero != 0);

        System.out.println("A soma de todos os números é: " + soma);
        leia.close();
    }
}