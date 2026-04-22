//Substituição em Array (Array + For + If):
//Crie um array de 10 números. Peça para o usuário preencher.
// Depois, percorra o array e substitua todos os números negativos por 0. Mostre o array final.

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Exe63_SubstituicaoEmArray {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int[]lista = new int[10];
        int numero;

        for (int i = 0; i < lista.length;i++){
            System.out.print("Informe o "+(i + 1)+"° número: ");
            numero = leia.nextInt();
            lista[i] = numero;
        }
        for (int i = 0; i < lista.length; i ++){
            if (lista[i] < 0){
                lista[i] = 0;
            }
        }

        System.out.print("A lista atualizada é: ");
        for (int i = 0; i < lista.length; i++){
            System.out.print(lista[i]+" ");
        }
    }
}
