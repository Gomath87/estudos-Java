//Qual o maior? (If/Else): Peça dois números e diga qual deles é o maior, ou se são iguais.

import java.util.Scanner;
public class Exe79_QualOMaior {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Digite o 1° número: ");
        num1 = leia.nextInt();
        System.out.print("Digite o 2° número: ");
        num2 = leia.nextInt();

        if (num1 > num2){
            System.out.println("O número "+num1+" é maior do que "+num2);
        } else if (num2 > num1) {
            System.out.println("O número "+num2+" é maior do que "+num1);
        }else {
            System.out.println("Ambos números são iguais!");
        }

        leia.close();
    }
}
