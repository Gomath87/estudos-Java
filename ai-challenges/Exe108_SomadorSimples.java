//Somador Simples
//Crie uma classe Calculadora.
//Método: somar(int a, int b) que imprime o resultado da soma.
//No Main: Crie a calculadora e peça para ela somar 5 + 5.

import java.util.Scanner;
public class Exe108_SomadorSimples {
    static void main() {
        Scanner leia = new Scanner (System.in);

        System.out.print("Informe um número para a soma: ");
        int num1 = leia.nextInt();
        System.out.print("Informe outro número para a soma: ");
        int num2 = leia.nextInt();

        calculadora minhacalc = new calculadora();
        minhacalc.somar(num1,num2);


    }
}



class calculadora {

    public void somar(int a, int b) {
        int resultado = a + b;
        System.out.println("O Resultado da soma é: "+ resultado);
    }



}
