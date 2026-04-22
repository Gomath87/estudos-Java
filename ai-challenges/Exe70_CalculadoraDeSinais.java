//Calculadora de Sinais: Peça dois números e um caractere (+, -, *, /).
// Use o switch para realizar a operação correspondente.

import java.util.Scanner;
public class Exe70_CalculadoraDeSinais {
    static void main() {
        Scanner leia = new Scanner(System.in);

        double num1;
        double num2;
        String sinal;

        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextDouble();
        System.out.println("Informe um operador (+,-,*,/): ");
        sinal = leia.next();

        switch (sinal){

            case "*":
                System.out.println("O resultado da multiplicação: "+num1+"x"+num2+"= "+(num1*num2));
                break;

            case "+":
                System.out.println("O resultado da soma: "+num1+"+"+num2+"= "+(num1+num2));
                break;

            case "/":
                if (num2 == 0){
                    System.out.println("Não é possível realizar a divisão por zero!");
                }else{
                    System.out.println("O resultado da divisão: "+num1+"/"+num2+"= "+(num1/num2));
                }
                break;

            case "-":
                System.out.println("O resultado da subtração: "+num1+"-"+num2+"= "+(num1-num2));
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }
    }
}
