
import java.util.Scanner;
public class Exe1067_NumerosImpares {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num = leia.nextInt();

        for (int i = 1; i <= num; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
