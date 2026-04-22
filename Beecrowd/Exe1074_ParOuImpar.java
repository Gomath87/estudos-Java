
import java.util.Scanner;
public class Exe1074_ParOuImpar {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num = leia.nextInt();

        for (int i = 1; i <= num; i ++){
            int number = leia.nextInt();

            if (number == 0){
                System.out.println("NULL");
            }else if (number % 2 == 0){
                if (number > 0){
                    System.out.println("EVEN POSITIVE");
                }else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else {
                if (number > 0){
                    System.out.println("ODD POSITIVE");
                }else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }
}
