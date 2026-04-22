
import java.util.Scanner;
public class Exe1117_ValidacaoDeNota {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int flag = 0;
        double media = 0;

        while (flag != 2){
            double nota = leia.nextDouble();

            if (nota < 0.0 || nota > 10.0){
                System.out.println("nota invalida");
            }else {
                media += nota;
                flag ++;
            }
        }
        media /= 2;
        System.out.printf("media = %.2f%n", media);
    }
}
