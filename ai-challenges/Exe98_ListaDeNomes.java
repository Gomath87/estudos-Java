//Lista de nomes: Crie um ArrayList com 2 nomes e imprima o primeiro.

import java.util.ArrayList;
public class Exe98_ListaDeNomes {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Matheus");
        lista.add("Natália");

        System.out.println(lista.get(0));

    }
}
