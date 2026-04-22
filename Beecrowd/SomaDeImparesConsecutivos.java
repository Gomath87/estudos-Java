
import java.util.Scanner;
public class SomaDeImparesConsecutivos {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int a = leia.nextInt();
        int b = leia.nextInt();

        int maior ;
        int menor ;
        int soma = 0;

        if (a > b){
            maior = a;
            menor = b;
        }else {
            maior = b;
            menor = a;
        }

        for (int i = menor+1; i < maior; i++) {
            if (i % 2 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
