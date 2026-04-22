//Peça um valor em metros.
// Depois mostre um menu: 1- Converter para Centímetros,
// 2- Converter para Milímetros, 3- Converter para Quilômetros.
// Use o switch para fazer o cálculo e mostrar.

import java.util.Scanner;
public class Exe69_ConversorDeUnidades {
    static void main() {
        Scanner leia = new Scanner(System.in);
        double metros;
        int opcao;
        double km;
        System.out.println("Digite um valor em metros: ");
        metros = leia.nextDouble();

        System.out.println("----------MENU----------");
        System.out.println();
        System.out.println("1 - Converter para centímetros");
        System.out.println("2 - Converter para milímetro");
        System.out.println("3 - Converter para quilômetros");
        opcao = leia.nextInt();

        switch (opcao){

            case 1:
                System.out.println("O valor "+metros+" convertido para centímetros fica: "+(metros*100)+"cm");
                break;
            case 2:
                System.out.println("O valor "+metros+" convertido para milímetros fica: "+(metros*1000)+"mm");
                break;
            case 3:
                km = metros / 1000.0;
                System.out.printf("O valor"+metros+" convertido para quilômetros fica: %.3f km%n",km);
                break;

        }


    }

}
