//Tabuada Personalizada: Peça um número e use o for para mostrar a tabuada dele de 1 a 20.

import java.util.Scanner;
public class Exe41_TabuadaPersonalizada {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um número para saber sua resepectiva tabuada: ");
        int num = leia.nextInt();

        for (int i = 1; i <= 20; i ++){
            System.out.println(num+"X"+i+" = "+(num*i));
        }
    }
}

