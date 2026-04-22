import java.util.Scanner;
public class Exe1153_FatorialSimples {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        int calculo = n;
        for ( int i = 1; i < n ; i ++){
            calculo *= i;
        }
        System.out.println(calculo);
    }
}
