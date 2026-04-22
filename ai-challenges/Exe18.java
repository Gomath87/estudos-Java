//2. Tabuada de um Número
//Objetivo: Usar a variável do laço para cálculos.
//
//Desafio: Use o Scanner para ler um número inteiro do usuário. Depois, use um for para mostrar a tabuada desse número (de 1 a 10).
//
//Exemplo de saída: 5 x 1 = 5, 5 x 2 = 10...

import java.util.Scanner;
public class Exe18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numero = leia.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "X" + i + " = " + numero * i);

        }
    }
}