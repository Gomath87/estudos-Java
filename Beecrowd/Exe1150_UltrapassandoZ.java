
import java.util.Scanner;
public class Exe1150_UltrapassandoZ {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int X = leia.nextInt();
        int Z;
        do {
            Z = leia.nextInt();
        }while (Z <= X);

        int soma = X;
        int numeroAt = X;
        int proxNumero = X + 1;
        int contador = 1;

        while (soma < Z){
            soma += proxNumero;
            contador ++;
            numeroAt = proxNumero;
            proxNumero += 1;


        }
        System.out.println(contador);
    }
}
