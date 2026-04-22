// (A * 3.5 + B * 7.5) / 11

import java.util.Scanner;
public class Exe1005_Média_1 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        double A = leia.nextDouble();
        double B = leia.nextDouble();
        double calculo = (A * 3.5 + B * 7.5) / 11.0;
        calculo = (A * 3.5 + B * 7.5) / 11.0;
        System.out.printf("MEDIA = %.5f%n",calculo);
    }
}
