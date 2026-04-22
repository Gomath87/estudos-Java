//Substituição de Elementos
//Objetivo: Usar o método .set() para atualizar dados.
//
//Desafio: Crie uma lista de 5 cores. Peça ao usuário um índice (0 a 4) e uma nova cor. Substitua a cor naquela posição e exiba a lista.

import java.util.Scanner;
import java.util.ArrayList;
public class Exe35 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Branco");
        cores.add("Cinza");
        cores.add("Rermei");
        cores.add("Amarelo");

        System.out.print("Informe um indice entre 0 a 4: ");
        int indice = leia.nextInt();
        leia.nextLine();
        System.out.println("Informe a cor que deseja substituir: ");
        String newcolor = leia.nextLine();
        cores.set(indice, newcolor);
        System.out.println(cores);
    }
}
