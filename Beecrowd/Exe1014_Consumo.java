import java.util.Scanner;
public class Exe1014_Consumo {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int km = leia.nextInt();
        double litro = leia.nextDouble();
        double calculo = km / litro;
        System.out.printf("%.3f km/l%n", calculo);
    }
}
