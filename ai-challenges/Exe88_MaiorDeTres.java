//Maior de Três (If + Else If):
// Peça três números diferentes e descubra qual deles é o maior.

import java.util.Scanner;
public class Exe88_MaiorDeTres {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.print("Digite o primeiro número: ");
        num1 = leia.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = leia.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = leia.nextInt();

        if ((num1 > num2) && ( num1 > num3)){
            System.out.println("O maior número é: "+num1);

        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("O mair número é: "+num2);

        }else{
            System.out.println("O maior número é: "+num3);

        }

        leia.close();
    }
}
