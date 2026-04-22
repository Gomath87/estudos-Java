// Conversor de Moedas: Peça um valor em Reais.
// Menu: 1-Dólar, 2-Euro, 3-Libra.
// Converta e mostre o resultado.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Exe75_ConversorDeMoedas {
    static void main() {
        Scanner leia = new Scanner(System.in);

        double calculo;
        double real;
        int opcao;
        System.out.print("Informe um valor em real: ");
        real = leia.nextDouble();

        System.out.println("-----MENU-----");
        System.out.println();
        System.out.println("1 = Dólar");
        System.out.println("2 = Euro");
        System.out.println("3 = Libra");
        System.out.println();
        System.out.print("Informe a opção desejada: ");
        opcao = leia.nextInt();

        switch (opcao){
            case 1:
                calculo = real / 5.25;
                System.out.printf("O valor convertido para Dollar é: %.2f",calculo);
                break;
            case 2:
                calculo = real / 6.05;
                System.out.printf("O valor convertido para Euro é: %.2f",calculo);
                break;
            case 3:
                calculo = real / 7.00;
                System.out.printf("O valor convertido para Libra é: %.2f",calculo);
                break;
            default:
                System.out.println("Opção inválida!");

        }


    }
}
