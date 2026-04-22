//Diferença

import java.util.Scanner;
public class Exe1007_Diferença {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int A = leia.nextInt();
        int B = leia.nextInt();
        int C = leia.nextInt();
        int D = leia.nextInt();

        int diferenca = (A*B-C*D);
        System.out.println("DIFERENÇA = "+diferenca);
    }
}
