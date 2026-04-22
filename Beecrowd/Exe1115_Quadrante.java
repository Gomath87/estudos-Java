
import java.util.Scanner;
public class Exe1115_Quadrante {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int a,b;

        do {
            a = leia.nextInt();
            b = leia.nextInt();

            if (a > 0 && b > 0){
                System.out.println("primeiro");
            } else if (a < 0 && b > 0 ) {
                System.out.println("segundo");
            } else if (a < 0 && b < 0){
                System.out.println("terceiro");
            } else if (a > 0 && b < 0) {
                System.out.println("quarto");
            }

        }while (a != 0 && b != 0);
    }
}
