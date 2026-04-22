import java.util.Scanner;
public class Exe1017_GastoDeCombustível {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int tempo = leia.nextInt();
        int velocidade = leia.nextInt();
        double calculo = (tempo * velocidade) / 12.0 ;
        System.out.printf("%.3f%n",calculo);
        leia.close();
    }
}
