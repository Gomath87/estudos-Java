//Menu de Cores (Switch): Menu com 1-Vermelho, 2-Azul, 3-Verde.
// O programa deve imprimir a cor escolhida.

import java.util.Scanner;
public class Exe89_MenuDeCores {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int cor;

        System.out.println("-----MENU DE CORES-----");
        System.out.println();
        System.out.println("1 - Vermelho");
        System.out.println("2 - Azul");
        System.out.println("3 - Verde");
        System.out.println("-----------------------");
        System.out.print("informe a opção desejada: ");
        cor = leia.nextInt();

        switch (cor){

            case 1:
                System.out.println("Você escolheu a cor Vermelho!");
                break;
            case 2:
                System.out.println("Você escolheu a cor Azul!");
                break;
            case 3:
                System.out.println("Você escolheu a cor Verde!");
                break;
            default:
                System.out.println("Você não escolheu uma opção válida!");
                break;
        }

        leia.close();
    }
}
