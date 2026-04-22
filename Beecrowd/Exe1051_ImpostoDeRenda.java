
import java.util.Scanner;
public class Exe1051_ImpostoDeRenda {
    static void main() {
        Scanner leia = new Scanner(System.in);
        leia.useLocale(java.util.Locale.US);
        double salario = leia.nextDouble();

        double imposto = 0;

        if (salario <= 2000.00){
            System.out.println("Isento");
        }else {
            if (salario > 4500.00) {
                imposto += (salario - 4500.00) * 0.28;
                imposto += (1500 * 0.18);
                imposto += (1000 * 0.08);
                System.out.printf("R$ %.2f%n",imposto);

            } else if (salario > 3000.00) {
                imposto += (salario - 3000.00) * 0.18;
                imposto += (1000.00 * 0.08);
                System.out.printf("R$ %.2f%n",imposto);

            }else {
                imposto += (salario - 2000.00) * 0.08;
                System.out.printf("R$ %.2f%n",imposto);
            }


        }
    }
}
