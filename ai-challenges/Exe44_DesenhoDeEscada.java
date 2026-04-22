//Desenho de Escada: Peça um número n e use o for para imprimir n linhas de asteriscos (Ex: se n=3, imprime *, **, ***).

import java.util.Scanner;
public class Exe44_DesenhoDeEscada {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int numero = leia.nextInt();

        for (int i = 1; i <= numero; i++){
            System.out.println();
            for (int e = 1; e <= i; e++){
                System.out.print("*");
            }
        }
        leia.close();
    }
}
