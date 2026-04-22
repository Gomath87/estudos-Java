//O Calculador de Média (Beecrowd Style)
//Objetivo: Praticar nextDouble() e operações matemáticas.
//
//Desafio: Leia duas notas de um aluno (tipo double). Calcule a média simples. Se a média for maior ou igual a 7.0, imprima "Aprovado". Caso contrário, imprima "Reprovado".
//
//Dica: No IntelliJ, use o ponto (.) para casas decimais (ex: 7.5).

import java.util.Scanner;

public class Exe11 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();

        double media = (A + B) / 2 ;

        if (media >= 7.0){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");

        }

        teclado.close();

    }


}
