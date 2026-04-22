
import java.util.Scanner;
public class Exe1113_CrescenteEDecrescente {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int num1,num2;

        do {
            num1 = leia.nextInt();
            num2 = leia.nextInt();
            if (num1 > num2) {
                System.out.println("Decrescente");
            } else if (num2 > num1) {
                System.out.println("Crescente");
            }

        }while (num1 != num2);
    }
}
