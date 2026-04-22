
import java.util.Scanner;
public class Exe1037_Intervalo {
    static void main() {
        Scanner leia = new Scanner(System.in);
        leia.useLocale(java.util.Locale.US);
        double valor = leia.nextDouble();

        if (valor < 0 || valor > 100){
            System.out.println("Fora de intervalo");
        } else if (valor > 75) {
            System.out.println("Intervalo (75,100]");
        } else if (valor > 50) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 25) {
            System.out.println("Intervalo (25,50]");
        } else  {
            System.out.println("Intervalo [0,25]");
        }
    }
}
