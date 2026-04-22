//2. Removendo o Indesejado
//Objetivo: Aprender a remover itens por índice ou valor.
//Desafio: Crie uma lista com 5 nomes de frutas. Peça ao usuário para escolher uma fruta para remover. Remova-a usando .remove() e mostre a lista atualizada.

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Exe34 {
    static void main() {
        Scanner ler = new Scanner (System.in);
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("banana", "Maçã", "Pêra", "Goiaba", "Uva"));
        System.out.println("Informe uma fruta que deseja remover da lista: ");
        String fruta = ler.nextLine();
        lista.remove(fruta);
        System.out.println(lista);

    }
}
