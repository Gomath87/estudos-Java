//O Maior de Três
//Objetivo: Praticar operadores lógicos (&& que significa "E").
//
//Desafio: Leia três números inteiros e use o if/else if para descobrir qual é o maior entre eles. Imprima apenas o maior valor.

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        int num1 = leia.nextInt();
        System.out.println("Informe o segundo número");
        int num2 = leia.nextInt();
        System.out.println("Informe o terceiro número");
        int num3 = leia.nextInt();

        if ((num1 > num2) && (num1 > num3)){
            System.out.println("O maior número é o: "+num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("O maior número é o: "+num2);
        } else {
            System.out.println("O maior número é o: "+num3);
        }
    }
}
