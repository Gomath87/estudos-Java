//Validando a Nota: Peça para o usuário digitar uma nota entre 0 e 10.
// Enquanto ele digitar um valor inválido (menor que 0 ou maior que 10), mostre "Nota inválida! Digite novamente".

import java.util.Scanner;
public class Exe37 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = leia.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("❌ Nota inválida! Tente novamente.");
            }
        }while (nota < 0 || nota > 10);
        System.out.println("Sistema finalizado!");
        leia.close();
    }
}
