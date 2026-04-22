//Estações do Ano: Peça o número do mês (1-12)
// e diga em qual estação do ano estamos (Verão, Outono, Inverno ou Primavera).

import java.util.Scanner;
public class Exe76_EstacoesDoAno {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int estacao;
        System.out.print("Digite o número do mês para saber sua respectiva estação: ");
        estacao = leia.nextInt();

        switch (estacao){

            case 12:
            case 1:
            case 2:
            case 3:
                System.out.println("Verão");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Outono");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("Inverno");
                break;

            case 10:
            case 11:
                System.out.println("Primavera");
                break;

            default:
                System.out.println("Mês inválido!");
        }

    }
}
