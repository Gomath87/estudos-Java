//🛠️ Exercício para você praticar Array + For
//Já que você aprendeu o laço for, o Array fica muito mais poderoso. Tente este exercício:
//Desafio: "Média de N Números com Memória"
//Pergunte ao usuário: "Quantas notas você quer digitar?".                                   ok
//Crie um array de double com esse tamanho: double[] notas = new double[quantidade];.        ok
//Use um for para preencher o array usando o Scanner.                                        ok
//Use outro for para percorrer o array, somar tudo e calcular a média.
//Diferencial: No final, mostre a média e diga quais notas ficaram acima da média.
//Dica de ouro: Para saber o tamanho de um array em Java, use nomeDoArray.length.

import java.util.Scanner;
public class Exe27 {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas notas você quer digitar?");
        int quantidade = leia.nextInt();
        double[] notas = new double[quantidade];


        for (int i = 0; i < quantidade; i++) {
            notas[i] = leia.nextDouble();
        }

        double soma = 0.0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double calculo = soma / notas.length;
        System.out.printf("A média das notas é: %.2f%n",calculo);

        System.out.println("Os números acima da média são: ");
        for (int i = 0; i < notas.length; i++){
            if (notas[i] > calculo){
                System.out.println(notas[i]);

            }
        }leia.close();
    }
}
