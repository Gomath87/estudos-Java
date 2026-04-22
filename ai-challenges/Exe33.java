//1. Lista de Compras Básica
//Objetivo: Praticar a criação e adição de elementos.
//Desafio: Crie um ArrayList<String>. Peça ao usuário para digitar 5 itens de mercado. Adicione-os à lista usando .add() e, ao final, imprima a lista completa.

import java.util.Scanner;
import java.util.ArrayList;

public class Exe33 {
    static void main() {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String produto;
        for (int i = 1; i <= 5; i++){
            System.out.print("Informe o "+i+"° produto: ");
            produto = leia.nextLine();
            lista.add(produto);

        }
        System.out.println(lista);
    }
}
