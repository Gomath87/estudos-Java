
import java.util.Scanner;
public class Exe1066_ParesImparesPositivosENegativos {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int num;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0 ; i < 5; i++){
            num = leia.nextInt();
            if (num % 2 == 0){
                par++;
            }else {
                impar++;
            }

            if (num > 0){
                positivo++;
            }

            if (num < 0){
                negativo++;
            }


        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+" valor(es) negativo(s)");

    }
}



