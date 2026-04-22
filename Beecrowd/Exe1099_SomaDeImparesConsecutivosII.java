
import java.util.Scanner;
public class Exe1099_SomaDeImparesConsecutivosII {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int quantidade = leia.nextInt();

        for (int i = 0; i < quantidade; i++) {

            int num1 = leia.nextInt();
            int num2 = leia.nextInt();
            int somaimpar = 0;


            if (num1 > num2){
                for (int a = num2 + 1; a < num1; a++) {
                    if (a % 2 != 0) {
                        somaimpar += a;
                    }
                }
            }else {
                for (int a = num1 + 1; a < num2; a++) {
                    if (a % 2 != 0) {
                        somaimpar += a;
                    }
                }
            }
            System.out.println(somaimpar);
        }
    }
}