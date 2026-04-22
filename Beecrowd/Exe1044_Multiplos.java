
import java.util.Scanner;
public class Exe1044_Multiplos {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int A = leia.nextInt();
        int B = leia.nextInt();

        if (A > B){
            if (A % B == 0){
                System.out.println("Sao Multiplos");
            }else {
                System.out.println("Nao sao Multiplos");
            }
        }else {
            if (B % A == 0){
                System.out.println("Sao Multiplos");
            }else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}
