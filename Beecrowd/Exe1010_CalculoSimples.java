import java.util.Scanner;

public class Exe1010_CalculoSimples {
    static void main() {

        Scanner leia = new Scanner(System.in);
        int peça1 = leia.nextInt();
        int quantidade1 = leia.nextInt();
        double valor = leia.nextDouble();

        int peça2 = leia.nextInt();
        int quatidade2 = leia.nextInt();
        double valor2 = leia.nextDouble();

        double calculo = (quantidade1 * valor) + (quatidade2 * valor2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",calculo);

    }
}
