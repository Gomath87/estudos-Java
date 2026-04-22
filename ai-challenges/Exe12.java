//Par ou Ímpar?
//Objetivo: Usar o operador de resto (%) e if/else.
//
//Desafio: Leia um número inteiro do teclado. Use o if para verificar se o resto da divisão desse número por 2 é zero.
//
//Se for zero, imprima: "O número é PAR".
//
//Caso contrário, imprima: "O número é ÍMPAR".

import java.util.Scanner;
public class Exe12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = leia.nextInt();
        if (num % 2 == 0){
            System.out.println("O número é PAR");
        }else {
            System.out.println("O número é ÍMPAR");
        }
        leia.close();
    }
}
