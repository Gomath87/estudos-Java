import java.util.Locale;
import java.util.Scanner;
public class Exe1064_PositivosEMedia {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        int quantidade = 0;
        double positivos = 0;
        double num;

        for (int i = 0; i < 6; i ++){
            num = leia.nextDouble();
            if (num > 0) {
                quantidade++;
                positivos += num;
            }
        }

        positivos /= quantidade;
        System.out.println(quantidade + " valores positivos");
        System.out.printf("%.1f%n", positivos);
    }
    

}
