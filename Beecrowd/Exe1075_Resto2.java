
import java.util.Scanner;
public class Exe1075_Resto2 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num = leia.nextInt();

        for (int i = 1; i <= 10000; i++){
            if (i % num == 2){
                System.out.println(i);
            }
        }
    }
}
