//Calculadora Simples
//Peça dois números e depois mostre um menu: 1- Somar, 2- Subtrair, 3- Multiplicar, 4- Dividir.
// Use o switch para decidir qual operação matemática realizar e exibir o resultado.

import java.util.Scanner;
public class Exe65_CalculadoraSimplesSwitchCase {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num1;
        int num2;
        int escolha;

        System.out.print("Informe o primeiro número: ");
        num1 = leia.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = leia.nextInt();

        System.out.println();
        System.out.println("-----MENU-----");
        System.out.println();
        System.out.println("1 = somar");
        System.out.println("2 = Subtrair");
        System.out.println("3 = Multiplicar");
        System.out.println("4 = Dividir");
        System.out.println();
        escolha = leia.nextInt();

        switch (escolha){
            case 1:
                System.out.println("RESULTADO: "+(num1 + num2));
                break;

            case 2:
                System.out.println("RESULTADO: "+(num1 - num2));
                break;

            case 3:
                System.out.println("RESULTADO: "+(num1 * num2));
                break;

            case 4:
                if (num2 == 0){
                    System.out.println("Não é possível dividir por zero.");
                }else{
                System.out.println("RESULTADO: "+(num1 / num2));
                break;
            }

        }

    }

}
