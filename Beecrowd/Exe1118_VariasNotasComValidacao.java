
import java.util.Scanner;
public class Exe1118_VariasNotasComValidacao {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int flag= 0;
        int resp = 0;
        double calculo = 0;

        do {
            double nota = leia.nextDouble();

            if (nota < 0.0 || nota > 10.0){
                System.out.println("nota invalida");
            } else {
                calculo += nota;
                flag ++;
            }

            if (flag == 2){
                System.out.printf("media = %.2f%n",(calculo/2));
                calculo = 0;
                flag = 0;

                do {
                    System.out.println("novo calculo (1-sim 2-nao)");
                     resp = leia.nextInt();

                }while (resp < 1 || resp > 2);
            }
        }while (resp != 2);
    }
}
