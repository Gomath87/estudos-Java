//Filtrando o "ArrayList" (ArrayList + For + If)
//Peça ao usuário para cadastrar 10 números.
//Crie duas listas extras: uma para pares e outra para impares.
//Use um for para percorrer a lista principal e distribuir os números nas outras duas. Exiba as três listas no final.

import java.util.Scanner;
import java.util.ArrayList;
public class FiltrandoOArrayList {
    static void main() {
        Scanner leia = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        int numero;

        for (int i = 0; i <= 9; i++){
            System.out.print("Informe o "+(i+1)+"° número: ");
            numero = leia.nextInt();
            System.out.println();
            lista.add(numero);

            if (numero % 2 == 0){
                par.add(numero);
            }else {
                impar.add(numero);
            }
        }

        System.out.println("Lista principal");
        System.out.println(lista);
        System.out.println("lista apenas com números pares");
        System.out.println(par);
        System.out.println("Lista apenas com números ímpares");
        System.out.println(impar);
        leia.close();
    }
}
