//2. Múltiplos de 3 e 5
//Objetivo: Filtrar números dentro de um intervalo.
//
//Desafio: Faça um laço que percorra de 1 até 100.
//
//Lógica: Se o número for múltiplo de 3, imprima "Fizz". Se for múltiplo de 5, imprima "Buzz". Se for dos dois ao mesmo tempo, imprima "FizzBuzz". Se não for de nenhum, imprima o próprio número.

public class Exe23 {
    static void main() {


         for (int i = 1; i <= 100; i++){


             if ((i % 3 == 0) && (i % 5 == 0)){
                 System.out.println("FizzBuzz");
             } else if (i % 3 == 0) {
                 System.out.println("Fizz");
             } else if (i % 5 == 0) {
                 System.out.println("Buzz");
             } else {
                 System.out.println(i);
             }
         }
    }
}
