
import java.util.Scanner;
public class Exe1145_SequenciaLogica2 {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int X= leia.nextInt();
        int Y = leia.nextInt();
        int valor = 0;
        int cont = 1;

        while (cont <= Y){

            valor ++;
            if (valor < X){
                System.out.print(cont+" ");
            } else if (valor == X) {
                System.out.println(cont);
                valor = 0;
            }
            cont += 1;
        }
    }
}
