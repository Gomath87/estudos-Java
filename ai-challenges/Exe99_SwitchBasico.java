//Switch básico: Peça um número (1, 2 ou 3). Se for 1, imprima "Café", 2 é "Chá", 3 é "Suco".

import java.util.Scanner;
public class Exe99_SwitchBasico {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int num;
        System.out.print("Informe um número entre 1 a 3: ");
        num = leia.nextInt();

        switch (num){

            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Chá");
                break;
            case 3:
                System.out.println("Suco");
                break;
            default:
                System.out.println("Opção inválida!");
                break;

        }
        System.out.println("Obrigado e volte sempre!");
    }
}
