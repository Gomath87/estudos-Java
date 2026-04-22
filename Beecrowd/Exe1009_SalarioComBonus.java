import java.util.Scanner;

public class Exe1009_SalarioComBonus {
    static void main() {
        Scanner leia = new Scanner(System.in);
        String nome = leia.nextLine();
        double salario = leia.nextDouble();
        double vendas = leia.nextDouble();

        if (vendas > 0){
            double percentual = (15.0 / 100) * vendas;
            double soma = percentual + salario;
            System.out.printf("TOTAL = R$ %.2f%n",soma);

        }else{
            System.out.printf("TOTAL = R$ %.2f%n",salario);
        }
        leia.close();
    }
}
