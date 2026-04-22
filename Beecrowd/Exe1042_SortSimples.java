
import java.util.ArrayList;
import java.util.Scanner;
public class Exe1042_SortSimples {
    static void main() {
        Scanner leia = new Scanner (System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();

        int n1 = leia.nextInt();
        int n2 = leia.nextInt();
        int n3 = leia.nextInt();

        lista.add(n1);
        lista.add(n2);
        lista.add(n3);

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (i == 0) {
                maior = lista.get(i);
                menor = lista.get(i);
            }
            if (lista.get(i) > maior) {
                maior = lista.get(i);
            }
            if (lista.get(i) < menor) {
                menor = lista.get(i);
            }
        }

        for (int i = 0; i < lista.size(); i++){

            if (maior == lista.get(i)){
                lista.remove(i);
                break;
            }
        }

        for (int i = 0; i < lista.size(); i++){

            if (menor == lista.get(i)){
                lista.remove(i);
                break;
            }
        }

        int meio = (n1 + n2 + n3) - maior - menor;

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}
