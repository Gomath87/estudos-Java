
import java.util.Scanner;
public class Exe1067_SeisNumerosImpares {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num = leia.nextInt();
        int quantidade = 0;
        while (quantidade < 6){
            if (num % 2 != 0){
                System.out.println(num);
                quantidade++;

            }
            num++;

        }
    }
}
