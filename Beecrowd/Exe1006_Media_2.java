
import java.util.Scanner;
public class Exe1006_Media_2 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        double A1 = leia.nextDouble();
        double A2 = leia.nextDouble();
        double A3 = leia.nextDouble();
        double calculo = (A1 * 2 + A2 * 3 + A3 * 5) / 10;
        System.out.printf("MEDIA = %.1f%n",calculo);
    }
}
