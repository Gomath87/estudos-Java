//Par ou Ímpar (If/Else):
// Peça um número e diga apenas se ele é "Par" ou "Ímpar" usando o resto da divisão % 2.

import java.util.Scanner;
public class Exe85_ParOuImpar {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.print("Informe um númmero para saber se o mesmo é par ou não: ");
        num = leia.nextInt();

        if (num % 2 == 0){
            System.out.println("O número "+num+" é par");
        }else {
            System.out.println("O número "+num+" é ímpar");
        }
    }
}
