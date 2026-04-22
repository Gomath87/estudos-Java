//Escolha seu herói (Switch): Peça um número de 1 a 3.
// Cada número representa um herói diferente. Imprima o nome do herói.

import java.util.Scanner;
public class Exe80_EscolhaSeuHeroi {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int numero;
        System.out.print("Informe um número de 1 a 3");
        numero = leia.nextInt();

        switch (numero){

            case 1:
                System.out.println("Você escolheu o Super Man!");
                break;
            case 2:
                System.out.println("Você escolheu o Batman!");
                break;
            case 3:
                System.out.println("Você escolheu o Spider Man");
                break;
            default:
                System.out.println("Número inválido!");
        }
        leia.close();
    }
}
