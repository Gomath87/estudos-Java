//Lista de Frutas (ArrayList + For): Adicione 4 frutas em um ArrayList.
// Use um for (ou for-each) para exibir cada uma delas com a frase "Eu gosto de [fruta]".

import java.util.ArrayList;
public class Exe90_ListaDeFrutas {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manga");
        lista.add("Pêra");
        lista.add("Uva");
        lista.add("Morango");

        for (int i = 0; i < lista.size(); i++){
            System.out.println("Eu gosto de "+lista.get(i));
        }
    }
}
