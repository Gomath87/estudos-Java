
import java.util.Scanner;
public class Exe1079_MediasPonderadas {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int quantidade = leia.nextInt();
        int cont = 0;

        while (cont != quantidade){
            float num1 = leia.nextFloat();
            float num2 = leia.nextFloat();
            float num3 = leia.nextFloat();

            float calculo = (num1 * 2 + num2 * 3 + num3 * 5) / 10;
            System.out.printf("%.1f%n",calculo);
            cont++;
        }
        leia.close();
    }
}
