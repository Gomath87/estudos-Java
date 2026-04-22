
import java.util.Scanner;
public class Exe1065_ParesEntreCincoNumeros {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int numero;
        int par = 0;
        for (int i = 0; i < 5 ; i ++){
            numero = leia.nextInt();

            if (numero < 0){
                numero += (numero + numero);
            }

            if (numero % 2 == 0){
                par ++;
            }

        }
        System.out.println(par + " valores pares");
    }
}
