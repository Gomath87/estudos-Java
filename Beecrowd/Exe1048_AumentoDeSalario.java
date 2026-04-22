
import java.util.Scanner;
public class Exe1048_AumentoDeSalario {
    static void main() {
        Scanner leia = new Scanner(System.in);
        leia.useLocale(java.util.Locale.US);

        double valor = leia.nextDouble();
        double novoSalario;
        double ganho;

        if (valor <= 400.00){
            novoSalario = valor * 1.15;
            ganho = novoSalario - valor;
            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",ganho);
            System.out.println("Em percentual: 15 %");

        } else if (valor <=800.00) {
            novoSalario = valor * 1.12;
            ganho = novoSalario - valor;
            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",ganho);
            System.out.println("Em percentual: 12 %");

        } else if (valor <= 1200.00) {
            novoSalario = valor * 1.10;
            ganho = novoSalario - valor;
            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",ganho);
            System.out.println("Em percentual: 10 %");

        } else if (valor <= 2000.00) {
            novoSalario = valor * 1.07;
            ganho = novoSalario - valor;
            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",ganho);
            System.out.println("Em percentual: 7 %");

        } else {
            novoSalario = valor * 1.04;
            ganho = novoSalario - valor;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",ganho);
            System.out.println("Em percentual: 4 %");

        }
    }
}
