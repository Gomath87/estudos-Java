
import java.util.Scanner;
public class Exe1116_DividindoXPorY {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int num = leia.nextInt();

        for (int i = 0; i < num; i++){
            int a = leia.nextInt();
            int b = leia.nextInt();

            if (b == 0){
                System.out.println("divisao impossivel");
            }else {
                double calculo = (double) a / b;
                System.out.printf("%.1f%n", calculo);
            }
        }
    }
}
