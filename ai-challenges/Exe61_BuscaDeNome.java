//Busca de Nome (ArrayList + For + If):
//Peça para o usuário cadastrar 5 nomes em uma lista.
// Depois, peça um nome para pesquisar.
// Use um for para varrer a lista e diga se o nome está lá ou não (sem usar o .contains(), faça na mão com if).

import java.util.ArrayList;
import java.util.Scanner;
public class Exe61_BuscaDeNome {
    static void main() {

        Scanner leia = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String nome;
        String nomePesquisa;
        boolean encontrado = false;

        for (int i = 1; i < 6; i++){
            System.out.print("Informe o "+i+"° nome: ");
            nome = leia.nextLine();
            lista.add(nome);
        }
        System.out.println("Qual nome você deseja pesquisar na lista? ");
        nomePesquisa = leia.nextLine();

        for (int i = 0; i < lista.size();i++){
            if (nomePesquisa.equalsIgnoreCase(lista.get(i))){
                System.out.println("Nome encontrado na posição: "+(i+1)+" da lista!");
                encontrado = true;
                break;

            }
        }
        if (encontrado == false){
            System.out.println("O nome "+nomePesquisa+" não foi encontrado na lista.");
        }
    }
}
