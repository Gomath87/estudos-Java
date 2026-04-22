//Inversor de Números: Peça 10 números e guarde num Array.
// Use um for para percorrer e, se o número for negativo, transforme-o em positivo (multiplique por -1)
// antes de exibir a lista final.

import java.util.Arrays;
import java.util.Scanner;
public class Exe59_InversorDeNumeros {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int[] lista = new int[10];
        int numero;
        int numeroPositivo;

        for (int i = 0; i < lista.length; i++){
            System.out.print("Informe o "+(i+1)+"° número: ");
            numero = leia.nextInt();

            if (numero < 0){
                numeroPositivo = Math.abs(numero);
                lista[i] = numeroPositivo;
            }else {
                lista[i] = numero;
            }
        }
        System.out.println();
        System.out.println("Lista: ");
        for (int i = 0; i < lista.length; i++){
            System.out.print(lista[i]+" ");
        }
    }
}
