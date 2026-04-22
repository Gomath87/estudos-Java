import java.util.Scanner;
public class Exe1008_salario {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int A = leia.nextInt();
        int B = leia.nextInt();
        double C = leia.nextDouble();
        double calculo = B * C;
        System.out.println("NUMBER = "+A);
        System.out.printf("SALARY = U$ %.2f%n",calculo);
    }
}
