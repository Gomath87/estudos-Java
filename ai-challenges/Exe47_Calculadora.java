//Calculadora Infinita: Peça dois números e mostre a soma.
// Depois, pergunte: "Deseja continuar? (S/N)". Use o while para repetir o processo enquanto a resposta for "S".

import java.util.Scanner;
public class Exe47_Calculadora {
    static void main() {
        Scanner leia = new Scanner(System.in);
        double num1;
        double num2;
        double calculo;
        String resposta;
        String resp1 = "s";
        String resp2 = "n";

    System.out.println("-----CALCURADORA INFINITA-----");
        do {
            System.out.print("Informe o primeiro número: ");
            num1 = leia.nextDouble();
            System.out.print("Informe o segundo número: ");
            num2 = leia.nextDouble();
            calculo = num1 + num2;

            System.out.println("O resultado é: "+ calculo);
            System.out.println();
            System.out.print("Deseja continuar?(S/N): ");
            resposta = leia.next();
            System.out.println();


        }while (resposta.equalsIgnoreCase("s"));

        System.out.println("-----Calculadora infinita fechada-----");
    }
}
