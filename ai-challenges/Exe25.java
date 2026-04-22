//Média de "N" Números
//Objetivo: Laço controlado por uma variável de entrada.
//
//Desafio: Primeiro, pergunte ao usuário: "Quantas notas você quer digitar?".
//
//Lógica: Use esse valor dentro da condição do for. Dentro do laço, leia as notas, some-as e, ao final, mostre a média aritmética.

import java.util.Scanner;

public class Exe25 {
    static void main() {

        Scanner leia = new Scanner(System.in);
        System.out.println("Quantas notas você quer digitar?");
        int quantidade = leia.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidade; i++ ){
            System.out.print("Informe a Nota"+i+": ");
            double nota = leia.nextDouble();
            soma += nota;
        }

        double media;
        media = soma / quantidade;

        System.out.println("A média aritmética das notas informadas são: "+media);


    }
}
