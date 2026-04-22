//5. Somatório Simples
//Objetivo: Praticar o acúmulo de valores dentro do laço.
//
//Desafio: Crie uma variável soma começando em 0. Peça para o usuário digitar 5 números usando o Scanner dentro de um for.
//A cada número digitado, some-o à variável soma. Ao final, mostre o total da soma.

import java.util.Scanner;
public class Exe21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite o "+i+"° número: ");
            int numero = leia.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos números informados é: "+soma);
    }
}
