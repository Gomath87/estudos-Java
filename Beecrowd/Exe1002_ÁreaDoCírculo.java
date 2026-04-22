//Área do Círculo

import java.util.Scanner;
public class Exe1002_ÁreaDoCírculo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double raio = leia.nextDouble();
        double n = 3.14159;
        double calculo = (n * (raio * raio));
        System.out.printf("A=%.4f%n",calculo);
    }
}
