
import java.util.Scanner;
public class Exe1015_DistânciaEntreDoisPontos {
    static void main() {
        Scanner leia = new Scanner(System.in);

        double x1 = leia.nextDouble();
        double y1 = leia.nextDouble();
        double x2 = leia.nextDouble();
        double y2 = leia.nextDouble();

        double calculo = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow((y2 - y1),2));
        System.out.printf("%.4f%n",calculo);
    }
}
