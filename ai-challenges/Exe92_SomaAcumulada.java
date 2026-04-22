//Soma acumulada (While + Scanner): Peça números ao usuário.
// O programa deve somar tudo o que ele digitar, até ele digitar 0. Aí ele para e mostra o total.

import java.util.Scanner;
public class Exe92_SomaAcumulada {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num;
        int soma = 0;
        int cont = 1;

        do {
            System.out.print("Informe o "+cont+"° número: ");
            num = leia.nextInt();
            cont ++;
            soma += num;

        }while (num != 0);

        System.out.println("A soma é: "+soma);
        leia.close();
    }
}
