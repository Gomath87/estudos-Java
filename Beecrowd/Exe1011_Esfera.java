//volume = (4/3.0) * pi * raio**3

import java.util.Scanner;
public class Exe1011_Esfera {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int raio = leia.nextInt();
        double pi = 3.14159;
        double volume = ((4/3.0) * pi) * (Math.pow(raio,3));
        System.out.printf("VOLUME = %.3f%n",volume);
        leia.close();
    }
}
