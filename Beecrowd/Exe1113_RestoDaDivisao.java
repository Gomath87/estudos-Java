
import java.util.Scanner;
public class Exe1113_RestoDaDivisao {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num1 = leia.nextInt();
        int num2 = leia.nextInt();
        int maior = 0;
        int menor = 0;

        if (num1 > num2){
            maior = num1;
            menor = num2;
        }else {
            menor = num1;
            maior = num2;
        }

        for (int i = menor+1; i < maior; i++){
            if (i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
    }
}
