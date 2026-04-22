

import java.util.Scanner;
public class Exe1036_FormulaDeBhaskara {
    static void main() {
        Scanner leia  = new Scanner(System.in);
        leia.useLocale(java.util.Locale.US);
        double A = leia.nextDouble();
        double B = leia.nextDouble();
        double C = leia.nextDouble();

        double delta = (B * B) - (4 * A * C);

        if (A == 0  || delta < 0){
            System.out.println("Impossivel calcular");
        }else {
            double r1 = (-B + Math.sqrt(delta)) / (2 * A);
            double r2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

    }
}
