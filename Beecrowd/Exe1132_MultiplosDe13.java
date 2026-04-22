
import java.util.Scanner;
public class Exe1132_MultiplosDe13 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int soma = 0;
        int num1 = leia.nextInt();
        int num2 = leia.nextInt();

        int maior;
        int menor;

        if (num1 > num2){
            maior = num1;
            menor = num2;
        }else {
            maior = num2;
            menor = num1;
        }

        for (int i = menor; i <= maior; i ++){
             if (i % 13 != 0){
                 soma += i;
             }
        }
        System.out.println(soma);
    }
}
