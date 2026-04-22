//Filtro de Nomes Longos: Peça 5 nomes usando um for e guarde num ArrayList.
// Depois, use outro for com um if dentro para exibir apenas os nomes que têm mais de 5 letras.

import java.util.Scanner;
import java.util.ArrayList;
public class Exe54_FiltroDeNomesLongos {
    static void main() {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String nome;

        for (int i = 1; i < 6; i++){
            System.out.print("Informe o "+i+"° nome: ");
            nome = leia.nextLine();
            lista.add(nome);
        }

        System.out.println("As Palavras que passam de 5 letras são: ");

        for (int i = 0 ; i < lista.size(); i++){

            String palavra = lista.get(i);

            if (palavra.length() > 5){
                System.out.println(palavra);
            }

        }
    }
}
