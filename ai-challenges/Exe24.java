// Fatorial de um Número
// Objetivo: Praticar multiplicações acumuladas.Desafio: Leia um número inteiro (ex: 5).
// Use o for para calcular o fatorial dele ($5! = 5 \times 4 \times 3 \times 2 \times 1$).
// Dica: Comece uma variável resultado = 1 e vá multiplicando ela pelos valores do laço.

import java.util.Scanner;
public class Exe24 {
    static void main() {

        Scanner leia = new Scanner(System.in);
        System.out.print("Informe um número para saber seu respectivo fatorial: ");

        int numero = leia.nextInt();
        int soma = 1;

        for (int i = 2; i <= numero; i++){
            soma *= i;
        }
        System.out.println("O fatorial de "+numero+" é "+soma);
    }
}
