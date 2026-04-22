//Maior e Menor da Lista (ArrayList + For):
//Peça para o usuário digitar números até ele digitar um número negativo.
// Guarde os números (positivos) em um ArrayList e depois mostre qual foi o maior e o menor valor digitado.

import java.util.ArrayList;
import java.util.Scanner;

public class Exe62_MaiorEMenorDaLista {
    static void main() {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        int num = 0;
        int cont = 0;
        int maior = 0;
        int menor = 0;


        while (num >= 0){
            cont++;
            System.out.print("Digite o "+cont+" número: ");
            num = leia.nextInt();


            if (cont == 1){
                maior = num;
                menor = num;
            }

            if (num >= 0){
                lista.add(num);
                if (num > maior){
                    maior = num;
                }

                if (num < menor){
                    menor = num;
                }
            }else{
                break;
            }


        }
        System.out.println("O maior valor digitado foi: "+maior);

        System.out.println("O menor valor digitado foi: "+menor);

        leia.close();
    }
}
