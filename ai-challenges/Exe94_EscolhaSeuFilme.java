//Escolha seu Filme (Switch): Menu com 3 opções de filmes.
// Ao escolher, imprima o nome do filme e o gênero.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Exe94_EscolhaSeuFilme {
    static void main() {
        Scanner leia = new Scanner(System.in);

        int opcao;

        System.out.println("-----MENU-----");
        System.out.println();
        System.out.println("1 - Extermidador do futuro / Ação");
        System.out.println("2 - Velozes e Furiosos / Ação");
        System.out.println("3 - Procurando Nemo / Animação");
        System.out.println("--------------");
        System.out.println();
        System.out.println("Qual filme você quer assistir? ");
        opcao = leia.nextInt();

        switch (opcao){

            case 1:
                System.out.println("Extermidador do futuro / Ação");
                break;

            case 2:
                System.out.println("Velozes e Furiosos / Ação");
                break;

            case 3:
                System.out.println("Procurando Nemo / Animação");
                break;

            default:
                System.out.println("Opção inválida!");
        }
        leia.close();
    }
}
