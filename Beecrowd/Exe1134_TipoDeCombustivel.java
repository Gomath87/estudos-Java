
import java.util.Scanner;
public class Exe1134_TipoDeCombustivel {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int resp = 0;
        int alcool = 0;
        int diesel = 0;
        int gasolina = 0;

        while (resp != 4){
            resp = leia.nextInt();

            switch (resp){
                case 1:
                    alcool ++;
                    break;
                case 2:
                    gasolina ++;
                    break;
                case 3:
                    diesel ++;
                    break;

            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}
