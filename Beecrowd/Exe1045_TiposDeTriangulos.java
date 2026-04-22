
import java.util.ArrayList;
import java.util.Scanner;
public class Exe1045_TiposDeTriangulos {
    static void main() {
        Scanner leia = new Scanner(System.in);
        leia.useLocale(java.util.Locale.US);
        ArrayList<Float> lista = new ArrayList<>();

        float A = leia.nextFloat();
        float B = leia.nextFloat();
        float C = leia.nextFloat();

        lista.add(A);
        lista.add(B);
        lista.add(C);

        float maior = 0;
        float menor = 0;

        for (int i = 0; i < lista.size(); i++){
            if (i == 0){
                maior = lista.get(i);
                menor = lista.get(i);
            }

            if (lista.get(i) > maior){
                maior = lista.get(i);
            }

            if (lista.get(i) < menor){
                menor = lista.get(i);
            }

        }

        float meio = (A+B+C) - (maior+menor);

        if (maior >= meio+menor){
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if (maior * maior == meio * meio + menor * menor) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (maior * maior > meio * meio + menor * menor) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (maior * maior < meio * meio + menor * menor) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (maior == meio && meio == menor) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (maior == meio || maior == menor || meio == menor) {
                System.out.println("TRIANGULO ISOSCELES");

            }
        }
    }
}
