//Tabuada de Escolha Repetida: Use um while para perguntar qual tabuada o usuário quer ver.
// Após mostrar a tabuada (usando um for), pergunte: "Quer ver outra? (S/N)".
// Pare o while se ele digitar 'N'.

import java.util.Scanner;
public class Exe56_TabuadaDeEscolhaRepetida {
    static void main() {
        Scanner leia = new Scanner(System.in);

        String resposta = "s";
        int numero;
        int tamanho;

        while (resposta.equalsIgnoreCase("s") ){
            System.out.print("Deseja ver a tabuada de qual número? ");
            numero = leia.nextInt();

            System.out.print("Quer que a tabuada vá até que número? ");
            tamanho = leia.nextInt();

            System.out.println("-----------------------------");
            for (int i = 1; i <= tamanho; i ++){
                System.out.println(numero+" X "+i+"= "+(numero*i));
            }
            System.out.println("-----------------------------");
            System.out.println();

            System.out.print("Deseja ver a tabuada de outro número? (S/N): ");
            leia.nextLine();
            resposta = leia.nextLine();
        }
        System.out.println();
        System.out.println("Obrigado por usar nossos serviços!");
        leia.close();

    }
}
