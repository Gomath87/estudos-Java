//Contagem com While: Peça um número e faça uma contagem regressiva
// desse número até zero usando um while.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Exe78_ContagemComWhile {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        while (numero > -1){
            System.out.println(numero);
            numero --;
        }
    }
}
