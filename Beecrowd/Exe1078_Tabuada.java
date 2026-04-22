
import java.util.Scanner;
public class Exe1078_Tabuada {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num = leia.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(i+" x "+num+" = "+(i * num));
        }
    }
}
