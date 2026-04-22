//Produto Simples

import java.util.Scanner;
public class Exe1004_ProdutoSimples {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int A = leia.nextInt();
        int B = leia.nextInt();
        int calculo = A*B;
        System.out.println("PROD = "+calculo);
    }
}
